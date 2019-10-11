from random import randint
import re
pattern = re.compile(r'\(\d{2,}\)')
nums = [str(randint(1,6)) for x in range(25)]


flag = False
j = 24
i = 0
while i < j:
    if nums[i] == nums[i+1]:
        if not flag:
            nums.insert(i,"(")
            j = j + 1
            flag = True
    else:
        if flag:
            nums.insert(i+1,")")
            j = j + 1
            flag = False
    i = i+1
       
if nums[-1] == nums[-2]:
    nums.append(')')

out = "".join(nums)

occ = pattern.findall(out)

print(nums)
print ( max(occ, key=len))


