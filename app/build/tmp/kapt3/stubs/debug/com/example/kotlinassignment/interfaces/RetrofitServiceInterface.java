package com.example.kotlinassignment.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/kotlinassignment/interfaces/RetrofitServiceInterface;", "", "getData", "Lretrofit2/Call;", "Lcom/example/kotlinassignment/models/Items;", "app_debug"})
public abstract interface RetrofitServiceInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "s/2iodh4vg0eortkl/facts.json")
    public abstract retrofit2.Call<com.example.kotlinassignment.models.Items> getData();
}