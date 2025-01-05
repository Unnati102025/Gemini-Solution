# 3.Find the Second Largest Number in a List

def second_largest(nums):
    unique_nums = list(set(nums))  # Remove duplicates
    if len(unique_nums) < 2:
        return None
    unique_nums.sort(reverse=True)  # Sort in descending order
    return unique_nums[1]

nums = list(map(int, input("Enter numbers separated by spaces: ").split()))
print(f"The second largest number is: {second_largest(nums)}")
