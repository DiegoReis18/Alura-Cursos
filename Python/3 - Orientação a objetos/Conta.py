class Conta:
    def __init__(self,numero,titular,saldo): #construtor - self seria a referencia
        print("Construido objeto {}".format(self))
        self.__numero = numero # o __ indica o private do atributo
        self.__titular = titular
        self.__saldo = saldo

    def extrato(self): #todos os métodos precisam ter o self
        print("Saldo de {} reais do titular {}".format(self.__saldo, self.__titular))

    def deposita(self, valor):
        self.__saldo += valor;
        print("Novo saldo da conta: {}".format(self.__saldo))

    def saca(self, valor):
        self.__saldo -= valor;
        print("Novo saldo da conta: {}".format(self.__saldo))

    def transfere(self, valor, destino): #o self já é o objeto de origem
        self.saca(valor)
        destino.deposita(valor)
        

