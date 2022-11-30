import Conta
import datas

conta1 = Conta.Conta(123,"Deigo",10) #não é necessário preencher o self
conta2 = Conta.Conta(1234,"Diego",1000)
conta2.extrato() #necessários chamar os métodos com o objeto no começo
conta2.deposita(100)
conta1.saca(5)
conta2.transfere(1,conta1)

d = datas.Data(21,11,2007)
d.formatacao()
