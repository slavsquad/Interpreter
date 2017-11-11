package com.company;

import com.company.Context.Context;
import com.company.Expression.AddExpression;
import com.company.Expression.Expression;
import com.company.Expression.NumberExpression;
import com.company.Expression.SubExpression;

public class Main {

    static Context context = new Context();
    static int variable;
    public static void main(String[] args) {

        Context context = new Context();
        // определяем набор переменных
        int x = 5;
        int y = 8;
        int z = 2;

        // добавляем переменные в контекст
        context.SetVariable("x", x);
        context.SetVariable("y", y);
        context.SetVariable("z", z);
        // создаем объект для вычисления выражения x + y - z
        Expression expression = new SubExpression(new AddExpression(new NumberExpression("x"), new NumberExpression("y")), new NumberExpression("z"));

        int result = expression.interpret(context);
        System.out.println(result);

    }
}
