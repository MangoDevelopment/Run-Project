package com.mangodev.crash;

import java.util.concurrent.Callable;

import com.mangodev.Author;
import com.mangodev.Copyright;
/*
 * @Author Bodie Brewer WITH Mango Development
 * @Copyright 2018 Mango Development, LLC All Rights Reserved
 * This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates
 */
@Copyright(details = "This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates", license = "N/A", year = 2018)
@Author(author = "Bodie Brewer")

public interface ICrashReportDetail<V> extends Callable<V>{}
