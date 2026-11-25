mathematics = int(input('Mathematics Score: '))
english = int(input('English Language Score: '))
french = int(input('French Score: '))

total = mathematics + english + french
average = total / 3

if mathematics >= 70:
    print('Mathematics Grade: A')
elif mathematics >= 60:
    print('Mathematics Grade: B')
elif mathematics >= 50:
    print('Mathematics Grade: C')
elif mathematics >= 45:
    print('Mathematics Grade: D')
elif mathematics >= 40:
    print('Mathematics Grade: E')
else:
    print('Mathematics Grade: F')

if english >= 70:
    print('English Grade: A')
elif english >= 60:
    print('English Grade: B')
elif english >= 50:
    print('English Grade: C')
elif english >= 45:
    print('English Grade: D')
elif english >= 40:
    print('English Grade: E')
else:
    print('English Grade: F')

if french >= 70:
    print('French Grade: A')
elif french >= 60:
    print('French Grade: B')
elif french >= 50:
    print('French Grade: C')
elif french >= 45:
    print('French Grade: D')
elif french >= 40:
    print('French Grade: E')
else:
    print('French waersx gf,Grade: F')

print('Total Score: ', total)
print('Average: ', average)

if average >= 50:
    print('Excellent. ')
elif average < 40:
    print('Fail')