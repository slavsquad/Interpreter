package com.company.Expression;

import com.company.Context.Context;

public class SubExpression implements Expression {
    private Expression left;
    private Expression right;

    public SubExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)-right.interpret(context);
    }
}

