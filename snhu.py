input_month = input()
input_day = int(input())
months_of_year = ['January', 'February', 'March', 'April', 'May', 'June',
                  'July', 'August', 'September', 'October', 'November', 'December']

# check if input_month in list is valid Jan-Dec
if input_month not in months_of_year:
    print('Invalid')
# check if days in months are valid 0-31
if (input_day >= 31) or (input_day <= 0):
    print('Invalid')
# check if input_day is within calendar day range
else:
    if (input_day >= 31) or (input_day <= 0):
        print('Invalid')
# check if inputs for month and day are in season
    elif ((input_month in ['March'] and input_day >= 20) or (input_month == 'April')
          or (input_month == 'May') or (input_month == 'June' and input_day <= 20)):
        print('Spring')
    elif ((input_month in ['June'] and input_day >= 21) or (input_month == 'July')
          or (input_month == 'August') or (input_month == 'September' and input_day <= 21)):
        print('Summer')
    elif ((input_month in ['September'] and input_day >= 22) or (input_month == 'November')
          or (input_month == 'October') or (input_month == 'December' and input_day <= 20)):
        print('Autumn')
    elif ((input_month in ['December'] and input_day >= 21) or (input_month == 'January')
          or (input_month == 'February') or (input_month == 'March' and input_day <= 19)):
        print('Winter')
