
def jogar():
    print("**********************************")
    print("Bem vindo ao jogo de Forca!")
    print("**********************************")
    palavra_secreta = "banana"
    enforcou = False
    acertou = False
    letras_acertadas = ["_","_","_","_","_","_"]
    while(not enforcou and not acertou): #pode ser (enforcou==False and acertou==False)
        index = 0
        print(letras_acertadas)
        chute = input("\nQual seu chute? ")
        for letra in palavra_secreta: #pega a letra 
            if(chute.lower().strip() == letra):
                letras_acertadas[index] = letra
                print("A letra {} está na posição {} da palavra.".format(letra,index))
            index += 1
      
        
    print("FIM DO JOGO")

if(__name__ == "__main__"):
    jogar()

