social_security_numbers = []

def fill_SSN():
	for i in range(15):
		social_security_numbers.append(i + 1)

def fill_SSN_range(start, finish):
	if (start <= finish):
		social_security_numbers.append(start)
		fill_SSN_range(start + 1, finish)

fill_SSN_range(1,99)
print(social_security_numbers)
