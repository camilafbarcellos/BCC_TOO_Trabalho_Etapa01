# BCC_TOO_Trabalho_Etapa01
Trabalho avaliativo da primeira etapa da disciplina de Tecnologia de Orientação a Objetos.
Instituto Federal Sul-Rio-Grandense (IFSul) - Câmpus Passo Fundo
Nome: Camila Florão Barcellos
Matrícula: 20202PF.CC0003
Professor: Jorge Luis Boeira Bavaresco
Data: 15/12/2021

1) Crie uma aplicação Java que deve fazer a leitura do nome de uma pessoa e do
seu salário. Com base no salário informado deve ser calculado o valor do
desconto do INSS e o valor do salário líquido. O valor de desconto do INSS
deve ser calculado conforme a faixa de valores da Tabela 1. O valor do salário
liquido corresponde ao valor do salário bruto menos o valor do desconto do
INSS. Use o controle de exceções para realizar a leitura dos dados. Após realizar
os cálculos apresente a seguinte saída para o usuário:

Nome: João da Silva
Salário bruto: 1900.00
INSS: 171.00
Salário líquido: 1729.00

De Até Alíquota
0,00 1.100,00 7,5%
1.100,01 2.203,48 9,00%
2.203,49 3.305,22 12,00%
3.305,23 6.433,57 14,00%
Tabela 1 - Tabela do desconto do INSS

----------------------------------------------------------------------------------

2) Crie uma aplicação Java que fará o cálculo do valor de locação de um veículo. O
valor total da locação é calculado pela quantidade de dias da locação
multiplicado pelo valor da diária. A aplicação deve ler o valor da diária, a data
de locação e a data de devolução. Use o controle de exceções para que não sejam
informados dados inválidos (valor da diária e datas). Após a leitura dos valores
calcule a quantidade de dias da locação e o valor total, e apresente os resultados
da seguinte forma:

Valor da diária: 180.00
Data de locação: 17/12/2021
Data de devolução: 19/12/2021
Dias de locação: 2
Valor total da locação: 360.00

----------------------------------------------------------------------------------

3) Crie uma aplicação Java que realize a leitura de uma data, para simular datas de
pagamento. A partir da data lida, calcule 5 datas de pagamento, com intervalos
de 7 dias entre uma data e outra. Utilize o controle de exceções para que a data
lida seja válida. Imprima no console a data informada pelo usuário a as datas de
vencimento, como na saída abaixo:

Data informada: 16/11/2021
Data de pagamento: 23/11/2021
Data de pagamento: 30/11/2021
Data de pagamento: 06/12/2021
Data de pagamento: 13/12/2021
Data de pagamento: 20/12/2021

----------------------------------------------------------------------------------

4) Crie uma aplicação Java que leia o valor de uma compra e a quantidade de
parcelas. Depois crie dois arrays com o tamanho da quantidade de parcelas lida,
para armazenar o valor de cada parcela e para a data de vencimento de cada
parcela. Realize o cálculo do valor da parcela e armazene no array o valor de
cada parcela. As datas de vencimento devem ser calculadas de 30 em 30 dias e
armazenadas no array, sendo que a data do primeiro vencimento deve ser
calculada a partir da data do sistema operacional. Depois exiba a seguinte saída
no console:

Valor da compra: 350.0
Total de parcelas: 5
Valor da parcela: 70.0 Data do 1º vencimento: 15/12/2021
Valor da parcela: 70.0 Data do 2º vencimento: 14/01/2022
Valor da parcela: 70.0 Data do 3º vencimento: 13/02/2022
Valor da parcela: 70.0 Data do 4º vencimento: 15/03/2022
Valor da parcela: 70.0 Data do 5º vencimento: 14/04/2022
