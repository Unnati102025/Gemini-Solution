# 2. Generate Fibonacci Sequence up to N and Find Primes

# Function to generate Fibonacci sequence 
def generate_fibonacci(n):
    fibonacci = [0, 1]  # Starting values
    while True:
        next_num = fibonacci[-1] + fibonacci[-2]  # Sum of last two numbers
        if next_num > n:  
            break
        fibonacci.append(next_num)
    return fibonacci

# Function to check if a number is prime
def is_prime(num):
    if num < 2:  # Numbers less than or equal to 1 are not prime
        return False
    for i in range(2, int(num ** 0.5) + 1):  # Check divisors up to square root of num
        if num % i == 0:
            return False  # Not prime if divisible
    return True

# Main function to select primes from the Fibonacci sequence
def primes_in_fibonacci(n):
    fibonacci_sequence = generate_fibonacci(n)  # Generate Fibonacci sequence
    primes = [num for num in fibonacci_sequence if is_prime(num)]  # Filter primes
    print("Fibonacci Sequence up to", n, ":", fibonacci_sequence)
    print("Prime Numbers in Fibonacci Sequence:", primes)

N = int(input("Enter a number: "))
primes_in_fibonacci(N)