print("**********************************")
print("Bem vindo ao jogo de adivinhação!")
print("**********************************")
num_secreto = 42
tentativas = 3
rodada = 1
while(rodada <= tentativas):
    printf("Tentativa {} de {} ".format(rodada,tentativas))
    chute = int(input("Digite o seu número: "))
    print("Você digitou ", chute)

    if(num_secreto==chute):
        print("Você acertou!!")
        rodada = tentativas
    elif(num_secreto>chute):
        print("Maior!\n")
        rodada = rodada+1
    else:
        print("Menor!\n")
        rodada = rodada+1

    if(rodada > tentativas):
        print("\nFIM!")
