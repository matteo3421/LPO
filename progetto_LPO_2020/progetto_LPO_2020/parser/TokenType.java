package progetto_LPO_2020.parser;

public enum TokenType { // important: SKIP, IDENT, and NUM must have ordinals 1, 2 and 3 
	EOF, SKIP, IDENT, NUM, PRINT, VAR, PLUS, TIMES, EQ, ASSIGN, OPEN_PAR,
	CLOSE_PAR, START_PAIR, END_PAIR, STMT_SEP, EXP_SEP, OPEN_BLOCK, CLOSE_BLOCK, MINUS, NOT, AND, BOOL,
	IF, ELSE, FST, SND, SEASONOF, SEASON, FOR, TO, LOWER, NUMBER,;

}

//aggiunti enum: SEASONOF, SEASON, FOR, TO, LOWER, NUMBER, 