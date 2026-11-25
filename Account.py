class Account:
    def __init__(self, name, account_number, balance):
     self.name = name
     self.account_number = account_number
     self.balance = balance
     self.history = ''

    def check_balance(self):
        print('Account Name:', self.name)
        print('Account number: ', self.account_number)
        print('Account Balance: ', self.balance)
        return self.balance

    def get_account_number(self):
        return self.account_number

    def deposit(self, amount):
        if amount <= 0:
            print(' deposit must be greater than 0')
            return

        self.balance += amount
        self.history += f'Deposit:  {amount}'
        print(f'New balance:  {self.balance}')

    def withdraw(self, amount):
      if amount <= 0:
        return print('Amount must be greater than 0.')

      if amount > self.balance:
         print('Insufficient balance. ')

         return
      self.balance -= amount
      self.history += f'Withdrawal:  {amount}   '
    print(f'New balance: {self.balance}')

    def transfer(self, receiver, amount):
        if receiver is self:
            return 'You can not send money to yourself'

        if amount > self.balance:
            return 'amount must be less than balance'

        self.balance -= amount
        receiver.balance += amount
        self.history += f'Transferred {amount} to {receiver.name  }.'
        print(f'Withdrew:  {amount}')

    def view_transactions(self):
        print(f'   TRANSACTION HISTORY  FOR {self.name}')
        if self.history == '':
            print('No transactions yet')
        else:
            print(self.history)
            print(f'Balance: {self.balance}')






