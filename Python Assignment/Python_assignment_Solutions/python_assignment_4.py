#4. Check If a String is a Valid Anagram
import string

def is_anagram(str1, str2):
    # Remove spaces and punctuation, and make everything lowercase to ignore case sensitivity
    str1 = ''.join(char.lower() for char in str1 if char.isalnum())
    str2 = ''.join(char.lower() for char in str2 if char.isalnum())

    # Check if the sorted characters in both strings are the same
    return sorted(str1) == sorted(str2)

#For example
str1 = "Listen!"
str2 = "Silent"

if is_anagram(str1, str2):
    print("Yes, the strings are anagrams!")
else:
    print("No, the strings are not anagrams.")
