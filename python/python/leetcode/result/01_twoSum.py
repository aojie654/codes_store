class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        flag0_var = 0
        result00_var = []
        for i in range(len(nums)):
            # sub00 = target - nums[i]
            # if sub00 in nums and nums.index(sub00) != i:
            #     result00_var.append(i)
            #     result00_var.append(nums.index(target - nums[i]))
            #     flag0_var = 1
            #     break
            for j in range(i + 1, len(nums)):
                if nums[i] == target - nums[j]:
                    result00_var = [i, j]
                    flag0_var = 1
                    break
            if flag0_var == 1:
                break
        if flag0_var == 0:
            result00_var = [0, 0]
        return result00_var


if __name__ == '__main__':
    so00 = Solution()
    nums, target = [3, 2, 4], 6
    result00_var = so00.twoSum(nums, target)
    print(result00_var)
