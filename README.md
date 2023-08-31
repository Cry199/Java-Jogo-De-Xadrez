# Jogo De Xadrez em Java
Clique aqui para jogar: https://replit.com/@Caua2/Java-Jogo-De-Xadrez

Este é um jogo de xadrez completo implementado em Java. 
O jogo segue todas as regras de xadrez e permite jogadas comuns como roque, 
captura en passant e promoção de peão.

# Funcionalidades
Jogo completo de xadrez com todas as regras e movimentos
Jogadores humanos vs. humanos (ainda sem IA)
Regras de movimento de cada peça implementadas
Validação de movimentos e posições inválidas
Roque, captura en passant e promoção de peão
Detecção de cheque e xeque-mate

# Estrutura de Classes
O projeto contém as seguintes classes principais:

ChessMatch: Gerencia o jogo e controle de turnos
ChessBoard: Representa o tabuleiro e posições das peças
ChessPiece: Superclasse para todas as peças
ConcretePiece: Classes para cada tipo de peça (Rei, Rainha, etc)
UI: Interface de usuário básica para entrada/saída
Foi utilizado um array 2D para representar o tabuleiro e as posições. Cada peça é uma instância das classes concretas de peça.

# Como Jogar
O jogo permite que dois jogadores humanos joguem um contra o outro. Cada jogador faz uma jogada por turno.

O usuário deve inserir a posição de origem e destino no formato "coluna linha" (por exemplo "e2 e4"). O jogo gerencia turnos, valida movimentos e atualiza o tabuleiro.

O objetivo é fazer xeque-mate no rei adversário.
# Possíveis Melhorias
Algumas possíveis extensões e melhorias:

Adicionar inteligência artificial para jogar contra o computador
Permitir jogo em rede entre dois jogadores
Desenvolver uma interface gráfica com animações
Suporte a jogadas com tempo limitado
Salvar/carregar jogos
Modos de visualização e análise de jogadas

