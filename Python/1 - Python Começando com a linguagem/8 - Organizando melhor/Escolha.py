import Forca
import Melhorias

print("**********************************")
print("Bem vindo ao Menu!")
print("**********************************")
jogo = 0
jogo = int(input("Escolha o jogo\n(1)Adivinhacao ou (2)Força\n"))
           
if(jogo==1):
    Melhorias.jogar()
elif(jogo==2):
    Forca.jogar()
    
