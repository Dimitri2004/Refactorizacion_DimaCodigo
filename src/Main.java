public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int PuntosJugador1, int PuntosJugador2) {
        String score=" ";
        if (isTie(PuntosJugador1, PuntosJugador2)) {
            return getTieScores(PuntosJugador1);
        }
        else if (isAdvantageOrWin(PuntosJugador1, PuntosJugador2))
        {
            return getAdvantageOrWinScores(PuntosJugador1, PuntosJugador2);
        }
        else
        {
            return getRegularScores(PuntosJugador1, PuntosJugador2, score);
        }

    }

    private static String getRegularScores(int PuntosJugador1, int PuntosJugador2, String score) {
        score = getMejorDeDos(PuntosJugador1, PuntosJugador2, score);
        return score;
    }

    private static String getMejorDeDos(int PuntosJugador1, int PuntosJugador2, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (isTie(i, 1)) tempScore = PuntosJugador1;
            else { score +="-"; tempScore = PuntosJugador2;}
            score = getValorDePuntos(score, tempScore);
        }
        return score;
    }

    private static String getValorDePuntos(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;
        }
        return score;
    }

    private static String getAdvantageOrWinScores(int PuntosJugador1, int PuntosJugador2) {
        String score;
        int minusResult = PuntosJugador1 - PuntosJugador2;
        if (isTie(minusResult, 1)) score ="Advantage player1";
        else if (isTie(minusResult, -1)) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static boolean isAdvantageOrWin(int PuntosJugador1, int PuntosJugador2) {
        return PuntosJugador1 >= 4 || PuntosJugador2 >= 4;
    }

    private static String getTieScores(int PuntosJugador1) {
        String score;
        switch (PuntosJugador1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static boolean isTie(int PuntosJugador1, int PuntosJugador2) {
        return PuntosJugador1 == PuntosJugador2;
    }
}