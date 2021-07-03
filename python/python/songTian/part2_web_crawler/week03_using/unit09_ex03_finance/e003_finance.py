import requests
import traceback
import re
from bs4 import BeautifulSoup


def get_html_text(url):
    try:
        r = requests.get(url, timeout=30)
        r.raise_for_status()
        r.encoding = r.apparent_encoding
        return r.text
    except:
        return ''


def get_stock_list(lst, stock_url):
    html = get_html_text(stock_url)
    soup = BeautifulSoup(html, 'html.parser')
    a = soup.find_all('a')
    for i in a:
        try:
            href = i.attrs['href']
            lst.append(re.findall(r'[s][hz]\d{6}', href)[0])
        except:
            continue


def get_stock_info(lst, stock_url, f_path):
    for stock in lst:
        url = stock_url + stock + '.html'
        html = get_html_text(url)
        try:
            if html == '':
                continue
            info_dict = {}
            soup = BeautifulSoup(html, 'html.parser')
            stock_info = soup.find('div', attrs={'class': 'stock-bets'})
            name = stock_info.find_all(attrs={'class': 'bets-name'})[0]
            info_dict.update({'股票名称': name.texxt.split()[0]})
            key_list = stock_info.find_all('dt')
            value_list = stock_info.find_all('dd')
            for i in range(len(key_list)):
                key = key_list[i].text
                val = value_list[i].text
                info_dict[key] = val

            with open(f_path, 'a', encoding='utf-8') as f:
                f.write(str(info_dict) + '\n')
        except:
            traceback.print_exc()
            continue


if __name__ == '__main__':
    stock_list_url = 'http://quote.eastmoney.com/stocklist.html'
    stock_info_url = 'https://gupiao.baidu.com/stock'
    output_file = 'D://BaiduStockInfo.txt'
    s_list = []
    get_stock_list(s_list, stock_list_url)
    get_stock_info(s_list, stock_info_url, output_file)
