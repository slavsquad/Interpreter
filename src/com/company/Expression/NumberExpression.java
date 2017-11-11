package com.company.Expression;

import com.company.Context.Context;

public class NumberExpression implements Expression {
    private String name;

    public NumberExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.GetVariable(name);
    }
}
