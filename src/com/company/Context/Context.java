package com.company.Context;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> variables;
    public Context()
    {
        variables = new HashMap<>();
    }
    // получаем значение переменной по ее имени
    public int GetVariable(String name)
    {
        return variables.get(name);
    }

    public void SetVariable(String name, int value)
    {
        variables.put(name,value);
    }
}