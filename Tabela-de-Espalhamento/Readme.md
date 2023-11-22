<h1>- - Tabela de Espalhamento - -</h1>

>[!Important]
>Implemente uma tabela de espalhamento que guarde as arestas que ligam os vertices de um grafo não orientado
>
![Grafo](https://github.com/cauaqroz/Est.-de-Dados/blob/main/Tabela-de-Espalhamento/Captura%20de%20tela%202023-11-22%20204057.png)

>[!Note]
>Tabela de Espalhamento do Grafo

| 1 | --> | 2 | --> | Null |
| -- | -- | --- | --- | --- | 

| 2 | --> | 1 | --> | 3 | --> | 5 | Null |
| -- | -- | --- | --- | --- | ---| ---| ---|


| 3 | --> | 2 | --> | 4 | --> | Null | 
| -- | -- | --- | --- | --- | ---| ---|


| 4 | --> | 3 | --> | 5 | --> | 6 | --> | Null |
| -- | -- | --- | --- | --- | ---| ---| ---| ---|

| 5 | --> | 2 | --> | 4 | --> | 6 | --> | Null |
| -- | -- | --- | --- | --- | ---| ---| ---| ---|

| 6 | --> | 4 | --> | 5 | --> | Null | 
| -- | -- | --- | --- | --- | ---| ---|
