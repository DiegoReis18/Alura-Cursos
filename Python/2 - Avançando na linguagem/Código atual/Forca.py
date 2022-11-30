import random
    
def jogar():
    abertura()
    palavra_secreta = sorteio()
    
    letras_acertadas = []
    letras_acertadas = inicializa_letras_acertadas(palavra_secreta)
    
    enforcou = False
    acertou = False
    tentativas = 10
    
    while(not enforcou and not acertou): #pode ser (enforcou==False and acertou==False)
        index = 0
        print(letras_acertadas)
        chute = input("\nQual seu chute? ")
        
        if(chute.lower().strip() in palavra_secreta):
            #acertou(chute,letras_acertadas,palavra_secreta,index)
            for letra in palavra_secreta: #pega cada letra da palavra_secreta
                if(chute.lower().strip() == letra):
                    letras_acertadas[index] = letra
                    print("A letra {} está na posição {} da palavra.".format(letra,index))
                index += 1  
        else:
            tentativas -= 1
            print("Errou ;-; - Tentativas restantes: {}".format(tentativas))
            enforcou = tentativas==0
        acertou = "_" not in letras_acertadas
      
    print(letras_acertadas)
    if(acertou):
        print("\nVOCE GANHOUUU")
    else:
        print("\nVOCÊ PERDEU :/")
    print("\nFIM DO JOGO")

def abertura():
    print("**********************************")
    print("Bem vindo ao jogo de Forca!")
    print("**********************************")

def sorteio():
    arquivo = open("palavras.txt","r")
    palavras = []
    for linha in arquivo:
        linha = linha.strip()
        palavras.append(linha)
    arquivo.close()
    numero = random.randrange(0, len(palavras))
    palavra = palavras[numero]
    return palavra

def inicializa_letras_acertadas(palavra_secreta):
    letras_acertadas = []
    for aux in palavra_secreta: #poderia usar o letras_acertadas["_" for aux in palavra_secreta]
        letras_acertadas.append("_")
    return letras_acertadas

        
def acertou(chute,letras_acertadas,palavra_secreta,index):
    for letra in palavra_secreta: #pega cada letra da palavra_secreta
        if(chute.lower().strip() == letra):
            letras_acertadas[index] = letra
            print("A letra {} está na posição {} da palavra.".format(letra,index))
        index += 1

if(__name__ == "__main__"):
    jogar()




