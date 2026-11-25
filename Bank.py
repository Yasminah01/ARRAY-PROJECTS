from Account import Account

class Bank:
 number_of_deposits = 0
 number_of_withdrawals = 0
 number_of_transfers = 0

 account1 = Account('Yasmina ', 259, 500)
 account2 = Account('Isa ', 491, 120)

 def get_account(self, account_number   ):
            if account_number == self.account1.account_number:
                return self.account1

            elif account_number == self.account2.account_number:
                return self.account2
            else:
                return None

 def login(self, account_number):
     account = self.get_account(account_number)

     if account is not None and account.account_number == account_number:
         print(f'Welcome {account.name}')
         return account

     else:
         print('Incorrect Account number.')
         return None



def account_menu(account, bank):
         while True:
             print('      ACCOUNT MENU      ')
             print('1. Balance enquiry. ')
             print('2. Deposit ')
             print('3. Withdraw ')
             print('4. Transfer ')
             print('5. Transaction history ')
             print('6. Log out')

             choice = int(input('Enter an option '))

             if choice == 1:
                 print('Balance enquiry selected')
                 account.check_balance()

             elif choice == 2:
                 print('Deposit selected')
                 amount = float(input('Enter deposit amount: '))
                 account.deposit(amount)

             elif choice == 3:
                 print('Withdraw selected')
                 amount = float(input('Enter withdrawal amount:'))
                 account.withdraw(amount)

             elif choice == 4:
                 print('Transfer selected')
                 acceptee = int(input('Enter receiver account number: '))
                 receiver = bank.get_account(acceptee)

                 amount = float(input('Enter amount to transfer: '))
                 account.transfer(receiver, amount)

             elif choice == 5:
                 print('Transaction history selected')
                 account.view_transactions()

             elif choice == 6:
                 print('You have logged out successfully')
                 break
             else:
                 print('Invalid option. Select an option')


bank = Bank ()

while True:
        print('      BANK LOGIN     ')
        print('1. LOGIN')
        print('2. EXIT ')
        option = int(input('Enter an option. '))

        if option == 1:

                acct = int(input('Enter account number(259 for Yasmina, 491 for Isa): '))
                account_entered = bank.login(acct)
                if account_entered:
                  account_menu(account_entered, bank)

        elif option == 2:
            break

