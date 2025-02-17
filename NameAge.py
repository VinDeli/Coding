from datetime import date
user_name = input("What is your name? \n")
user_age = int(input("How old are you? \n"))

current_yr = date.today().year
birth_year = current_yr - user_age

print('Hello' + ' ' + user_name + '!', 'You were born in' + ' ' + str(birth_year) + '.')
