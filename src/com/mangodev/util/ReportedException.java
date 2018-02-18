package com.mangodev.util;

import com.mangodev.Author;
import com.mangodev.Copyright;
import com.mangodev.crash.CrashReport;;
/*
 * @Author Bodie Brewer WITH Mango Development
 * @Copyright 2018 Mango Development, LLC All Rights Reserved
 * This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates
 */
@Copyright(details = "This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates", license = "N/A", year = 2018)
@Author(author = "Bodie Brewer")

public class ReportedException extends RuntimeException
{
    /** The crash report associated with this exception */
    private final CrashReport crashReport;

    public ReportedException(CrashReport report)
    {
        this.crashReport = report;
    }

    /**
     * Gets the CrashReport wrapped by this exception.
     */
    public CrashReport getCrashReport()
    {
        return this.crashReport;
    }

    public Throwable getCause()
    {
        return this.crashReport.getCrashCause();
    }

    public String getMessage()
    {
        return this.crashReport.getDescription();
    }
}
