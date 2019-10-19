import random
def random_ints_with_sum(n):
    """
    Generate positve random integers summing to `n`.
    """
    while n > 0:
        r = random.randint(1, n)
        yield r
        n -= r

piles = list(random_ints_with_sum(45))
piles = 
print (piles)
"""
def operation():
    if len(piles) != 9:
        piles.append([0]*(9-len(piles))) 

print (list(random_ints_with_sum(45)))
"""