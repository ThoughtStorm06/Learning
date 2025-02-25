def unicode_conversion(string):
    return [ord(char) for char in string]

def character(ascii_values):
    return ''.join(chr(n) for n in ascii_values)

def locate(string, n):
    print(string.find(n))

def index(string, n):
    print(string[n])

def splitting(string, n):
    return string[:n], string[n:]

def concat(str1, str2):
    return str1 + str2

def string_menu():
    print("""String:
    1 -> Unicode values of string
    2 -> Location of character
    3 -> Character at index
    4 -> Split string
    5 -> Show all stored strings
    6 -> Exit
    Enter your choice: """, end="")
    return int(input())

def string_operations(mode, choice):
    global l, l2, i

    if choice == 1:
        print(l2[i])

    elif choice == 2:
        char = input("Enter character to find: ")
        locate(l[i], char)

    elif choice == 3:
        z = int(input("Enter index: "))
        index(l[i], z)

    elif choice == 4:
        z = int(input("Index to split at: "))
        str1, str2 = splitting(l[i], z)
        print("Save split? (1: Yes, 2: No)")
        while True:
            m = int(input("Choice: "))
            if m == 1:
                l[i] = str1
                l2[i] = unicode_conversion(str1)
                l.insert(i + 1, str2)
                l2.insert(i + 1, unicode_conversion(str2))
                break
            elif m == 2:
                break
            else:
                print("Invalid choice")
    
    elif choice == 5:
        mode = 1  # Switch to list mode
    
    elif choice == 6:
        mode = 3  # Exit
    
    else:
        print("Invalid choice")
    
    return mode


if __name__ == "__main__":
    l = []
    l2 = []

    l.append(input("Enter a string: "))
    l2.append(unicode_conversion(l[0]))

    mode = 0  # 0: String Mode, 1: List Mode
    i = 0  # Current working string index

    while mode != 3:
        if mode == 0:
            choice = string_menu()
            mode = string_operations(mode, choice)
        
        elif mode == 1:
            print(l)
            print("""List:
    1 -> Select a string
    2 -> Delete a string
    3 -> Update a string
    4 -> Add more strings
    5 -> String Mode
    6 -> Exit
    Enter your choice: """, end="")
            list_choice = int(input())

            if list_choice == 1:
                i = int(input("Enter index of string: "))
                mode = 0  # Switch to string mode
            elif list_choice == 2:
                d = int(input("Index to remove: "))
                l.pop(d)
                l2.pop(d)
            elif list_choice == 3:
                d = int(input("Index to update: "))
                l[d] = input("Enter new string: ")
                l2[d] = unicode_conversion(l[d])
            elif list_choice == 4:
                n = int(input("Number of strings to add: "))
                for _ in range(n):
                    new_str = input("Enter string: ")
                    l.append(new_str)
                    l2.append(unicode_conversion(new_str))
            elif list_choice == 5:
                mode = 0  # Return to string mode

            elif list_choice ==6:
                mode=3
                
            else:
                print("Invalid choice")
