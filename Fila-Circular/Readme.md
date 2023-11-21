<h2> - - Fila Circular - - </h2>

>[!Warning]
>Na fila Circular voce consegue adicionar Elementos no inicio da fila mesmo apos chegar ao fim dela

|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | |  |  |  |  
| inicio | = | 0 |  |  |  |
| fim | = | 0 |  |  |
| tamanho | = | 0 |  | | 

>[!Caution]
>**Fim:** Indica a proxima casa que pode ser Adicionado um elemento<br> **Inicio:** Representa por onde a fila esta començando<br> **Tamanho:** Representa o tamanho atual da fila



#

>[!note]
>Adiciona 90

|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | | 90 |  |  |  
| inicio | = | 0 |  |  |  |
| fim | = | 1 |  |  |
| tamanho | = | 1 |  | |

#

>[!note]
>Adiciona 15

|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | | 90 | 15 |  |  
| inicio | = | 0 |  |  |  |
| fim | = | 2 |  |  |
| tamanho | = | 2 |  | |

#

>[!note]
>Remove 90 <br>Ao remover percebemos que o inicio da fila mudou

>retorna o "90"

|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | |  | 15 |  |  
| inicio | = | 1 |  |  |  |
| fim | = | 2 |  |  |
| tamanho | = | 1 |  | |

#

>[!note]
>Adiciona 20 <br>Fim se tornou o proximo indice disponivel


|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | |  | 15 | 20 |  
| inicio | = | 1 |  |  |  |
| fim | = | 0 |  |  |
| tamanho | = | 2 |  | |

#

>[!note]
>Adiciona 35

|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | | 35 | 15 | 20 |  
| inicio | = | 1 |  |  |  |
| fim | = | 1 |  |  |
| tamanho | = | 3 |  | |

>[!Caution]
>Antes de adicionar um novo elemento sempre faça a verificação para saber se a lista está cheia

#

>[!Important]
>Removendo elemento no meio da Lista Circular

>[!note]
>Remove 15<br> o inicio da fila se tornou o proximo indice que tem um elemento<br> o fim da fila é o indice que ficou disponivel para inserção de um novo elemento

|  FilaC | C1:  | | | | 
| -- | -- | -- | --- | --- | 
| indice | | 0 | 1 | 2 |  
| dados | | 35 |  | 20 |  
| inicio | = | 2 |  |  |  |
| fim | = | 1 |  |  |
| tamanho | = | 2 |  | |

















