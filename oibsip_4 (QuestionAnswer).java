package com.example.myquiz;

public class QuestionAnswer {
    public static String question[] = {
            "Who developed Python Programming Language?",
            "Which type of Programming does Python support?",
            "Is Python case sensitive when dealing with identifiers?",
            "Which of the following is the correct extension of the Python file?",
            "Is Python code compiled or interpreted?"
    };

    public static String choices[][] = {
            {"Wick van Rossum","Rasmus Lerdorf","Guido van Rossum","Niene Stom"},
            {"object-oriented programming","structured programming","functional programming","all of the mentioned"},
            {"no","yes","machine dependent","none of the mentioned"},
            {".python",".pl",".py",".p"},
            {"Python code is both compiled and interpreted","Python code is neither compiled nor interpreted","Python code is only compiled",
                    "Python code is only interpreted",}
    };

    public static String correctAnswers[] = {
            "Guido van Rossum",
            "all of the mentioned",
            "yes",
            ".py",
            "Python code is both compiled and interpreted",
    } ;

}
