import random 
def jogar():
    print("**********************************")
    print("Bem vindo ao jogo de adivinhação!")
    print("**********************************")
    num_secreto = random.randrange(1,101)
    tentativas = 3
    pontos = 1000

    print(num_secreto)
    print("ESCOLHA O NIVEL DE DIFICULDADE")
    print("(1) Facil\n(2) Médio\n(3) Dificil\n")
    escolha = int(input())

    if(escolha==1):
        tentativas = 10
    elif(escolha==2):
        tentativas = 5
    else:
        tentativas = 3


    for rodada in range (1, tentativas+1):
        print("Tentativa {0} de {1} ".format(rodada,tentativas))
        chute = int(input("Digite o seu número: "))
        print("Você digitou ", chute)

        if(chute<1 or chute>100):
            print("Você deve digitar entre 1 e 100! Rodada perdida!\n")
            continue

        if(num_secreto==chute):
            print("Você acertou!!")
            print("Pontos: {}".format(pontos))
            break
        elif(num_secreto>chute):
            print("Maior!\n")
            pontos_perdidos = abs(num_secreto - chute)
            pontos = pontos - pontos_perdidos
        else:
            print("Menor!\n")
            pontos_perdidos = abs(num_secreto - chute)
            pontos = pontos - pontos_perdidos
            
            
    print("\nFIM!")
    
