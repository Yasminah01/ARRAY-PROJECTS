name = str(input('Enter name: '))
price = float(input('Enter Price: '))
quantity = int(input('Enter quantity: '))

total = price * quantity

if total >= 15000:
    discount = total * 0.10
    print('Total: ', total)
    Final_total = total - discount
    print('Discount: ', discount)
    print('Final Total: ', Final_total)
    print('Discount granted.')
else:
    print('No Discount granted')