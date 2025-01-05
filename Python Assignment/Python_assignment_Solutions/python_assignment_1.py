# 1. File Analysis: Count Words, Lines, and Characters

# Function to analyze the file
def analyze_file(file_path):
    try:
        #Reading the text file
        # Open the file in read mode ('r')
        with open(file_path, 'r') as file:
            lines = file.readlines()  # Read all lines from the file
            
        #Computing required information   
            # A. Total number of lines in the file (by calculating the length of the list of lines)
            no_of_lines = len(lines)
        
            # B. Total number of words (by splitting each line into words and summing up the lengths of lists of these words)
            no_of_words = sum(len(line.split()) for line in lines)
            
            # C. Total number of characters (by summing up the lengths of all lines, including spaces and punctuation)
            no_of_char = sum(len(line) for line in lines)
        
        # Displaying the results
        print(f"Total Lines: {no_of_lines}")
        print(f"Total Words: {no_of_words}")
        print(f"Total Characters: {no_of_char}")
    
    except FileNotFoundError:
        # File does not exist
        print(f"Error: The file at '{file_path}' does not exist. Please check the path and try again.")

# Main program 
if __name__ == "__main__":
    print("Solution to Python assignment task 1")
    file_path = input("Enter the path to the text file: ") #Accepting the file path as input.
    analyze_file(file_path)