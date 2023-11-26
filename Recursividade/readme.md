# Recursividade

<p> Um metodo recursivo chama a si mesmo </p>

>[!Note]
>Exemplo Fatorial

4! = 4 * 3! <br> = 4 * (3 * 2!)<br> = 4 * (3 * (2 * 1!))<br> = 4 * (3 * (2 * (1 * 0!)))

<br>
<br>

|Empilha|||
|-|-|-|
| Fat(0) | | Ret 1 caso trivial |
| Fat(1) | | Ret 1 * fat(0) | 
| Fat(2) | | Ret 2 * fat(1) | 
| Fat(3) | | Ret 3 * fat(2) | 
| Fat(4) | | Ret 4 * fat(3) | 

 >[!note]
>Desempilhar retorna os valores do fatorial<br> 4 * 3 * 2 * 1 * 1
