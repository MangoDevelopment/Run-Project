package com.mangodev;
/*
 * @Author Bodie Brewer WITH Mango Development
 * @Copyright 2018 Mango Development, LLC All Rights Reserved
 * This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates
 */
@Copyright(details = "This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates", license = "N/A", year = 2018)
@Author(author = "Bodie Brewer")

public @interface MainClass {
	enum AccessLevel { PUBLIC, PROTECTED, PACKAGE_PROTECTED, PRIVATE}; 
    String author();
    String version();
    AccessLevel accessLevel() default AccessLevel.PACKAGE_PROTECTED;
    String[] reviewers();
}
