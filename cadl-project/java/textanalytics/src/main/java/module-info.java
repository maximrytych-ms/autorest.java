// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.language.textanalytics {
    requires transitive com.azure.core;

    exports com.azure.language.textanalytics;
    exports com.azure.language.textanalytics.models;

    opens com.azure.language.textanalytics.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}