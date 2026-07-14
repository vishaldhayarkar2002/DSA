# https://chat.deepseek.com/a/chat/s/ac2e3e57-73d9-46d6-83b8-a7e5e7bf39db
# Deepseek chat refernce
a = 10
b = 20
c = a

print(a is b)      # False (different objects)
print(a is c)      # True (same object)
print(a is not b)  # True

my_list = [10, 20, 30]
x, y = 24, 20

print(x in my_list)     # False
print(y in my_list)     # True
print(x not in my_list) # True

a, b = 10, 20
min_val = a if a < b else b  # Returns 10

# Truthy values (evaluate to True)
if 1: print("Truthy")    # Any non-zero number
if "text": print("Truthy")  # Non-empty string

# Falsy values (evaluate to False)
if 0: print("Falsy")     # Zero
if "": print("Falsy")    # Empty string
if None: print("Falsy")  # None

# 4. Set Type (set)
# Unordered, mutable, stores unique elements only

my_dict = {1: "Geeks", 2: "For", 3: "Geeks"}
print(my_dict[1])       # Geeks
print(my_dict.get(2))   # For
my_dict[4] = "Python"   # Add new pair
print(type(my_dict))    # <class 'dict'>

# print(type(variable))

# Check if specific type
if isinstance(x, int):
    print("x is an integer")

# Basic
for i in range(4):      # 0,1,2,3
    print(i)

# With start/end
for i in range(2, 6):   # 2,3,4,5
    print(i)

# With step
for i in range(0, 10, 2):  # 0,2,4,6,8
    print(i)

# Iterate list
arr = [1, 2, 3]
for item in arr:
    print(item)

# With index
for i in range(len(arr)):
    print(arr[i])

# enumerate - get index + value
for i, val in enumerate(arr):
    print(i, val)

# ✅ Right - iterate backwards
for i in range(len(arr)-1, -1, -1):
    if arr[i] == 5:
        arr.pop(i)

# *args = tuple of positional args
def sum_all(*args):
    return sum(args)

print(sum_all(1,2,3,4))  # 10

# **kwargs = dict of keyword args
def print_info(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")

print_info(name="John", age=30)  # name: John, age: 30

# Assign to variable
def greet(name):
    return f"Hello {name}"

say_hello = greet
print(say_hello("Alice"))  # Hello Alice

# Pass as argument
def apply(func, value):
    return func(value)

print(apply(greet, "Bob"))  # Hello Bob

# Return function
def make_multiplier(n):
    def multiplier(x):
        return x * n
    return multiplier

double = make_multiplier(2)
print(double(5))  # 10

students = [("Alice", 25), ("Bob", 20), ("Charlie", 22)]
# Sort by age using lambda (first-class function)
students.sort(key=lambda x: x[1])
print(students)  # [('Bob', 20), ('Charlie', 22), ('Alice', 25)]

# Syntax: map(function, iterable)
numbers = [1, 2, 3, 4]
squared = list(map(lambda x: x**2, numbers))
print(squared)  # [1, 4, 9, 16]

# Syntax: filter(function, iterable)
numbers = [1, 2, 3, 4, 5, 6]
evens = list(filter(lambda x: x % 2 == 0, numbers))
print(evens)  # [2, 4, 6]
from functools import reduce

# Syntax: reduce(function, iterable)
numbers = [1, 2, 3, 4]
product = reduce(lambda x, y: x * y, numbers)
print(product)  # 24 (1*2*3*4)



def print_alternates(arr):
    # Method 1: Using slicing (Pythonic)
    print(arr[::2])
    
    # Method 2: Using loop (More explicit)
    for i in range(0, len(arr), 2):
        print(arr[i], end=" ")
    print()

# Example
arr = [10, 20, 30, 40, 50, 60]
print_alternates(arr)  # Output: [10, 30, 50] or 10 30 50


def linear_search(arr, target):
    # Method 1: Using built-in (Pythonic)
    if target in arr:
        return arr.index(target)
    return -1

def find_largest(arr):
    # Method 1: Using built-in (Pythonic)
    return max(arr)

def reverse_list(arr):
    # Method 1: Slicing (Creates new list)
    return arr[::-1]