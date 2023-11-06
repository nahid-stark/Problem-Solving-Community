from datetime import datetime

months = {"January" : 31, "February": 28, "March" : 30, "April": 30, "May":31, "June": 30, 
           "July" : 31, "August" : 31, "September" : 30, "October": 31, "November": 30, "December" :31}

def is_leap_year(year):
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
            else:
                return False
        else:
            return True
    else:
        return False
    

def count_leap_days(start_date, end_date):
    leap_days = 0

    for year in range(start_date.year, end_date.year + 1):
        if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
            if datetime(year, 2, 29) <= end_date and datetime(year, 2, 29) >= start_date:
                leap_days += 1

    return leap_days

start_date_input = input("Enter the start date: ")
start_date = datetime.strptime(start_date_input, "%B %d, %Y")

end_date_input = input("Enter the end date: ")
end_date = datetime.strptime(end_date_input, "%B %d, %Y")

print(count_leap_days(start_date, end_date))