// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Document analysis result. */
@Fluent
public final class AnalyzeResult {
    /*
     * API version used to produce this result.
     */
    @JsonProperty(value = "apiVersion", required = true)
    private ApiVersion apiVersion;

    /*
     * Document model ID used to produce this result.
     */
    @JsonProperty(value = "modelId", required = true)
    private String modelId;

    /*
     * Method used to compute string offset and length.
     */
    @JsonProperty(value = "stringIndexType", required = true)
    private StringIndexType stringIndexType;

    /*
     * Concatenate string representation of all textual and visual elements in reading order.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Analyzed pages.
     */
    @JsonProperty(value = "pages", required = true)
    private List<DocumentPage> pages;

    /*
     * Extracted paragraphs.
     */
    @JsonProperty(value = "paragraphs")
    private List<DocumentParagraph> paragraphs;

    /*
     * Extracted tables.
     */
    @JsonProperty(value = "tables")
    private List<DocumentTable> tables;

    /*
     * Extracted key-value pairs.
     */
    @JsonProperty(value = "keyValuePairs")
    private List<DocumentKeyValuePair> keyValuePairs;

    /*
     * Extracted font styles.
     */
    @JsonProperty(value = "styles")
    private List<DocumentStyle> styles;

    /*
     * Detected languages.
     */
    @JsonProperty(value = "languages")
    private List<DocumentLanguage> languages;

    /*
     * Extracted documents.
     */
    @JsonProperty(value = "documents")
    private List<Document> documents;

    /** Creates an instance of AnalyzeResult class. */
    public AnalyzeResult() {}

    /**
     * Get the apiVersion property: API version used to produce this result.
     *
     * @return the apiVersion value.
     */
    public ApiVersion getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: API version used to produce this result.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setApiVersion(ApiVersion apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the modelId property: Document model ID used to produce this result.
     *
     * @return the modelId value.
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Document model ID used to produce this result.
     *
     * @param modelId the modelId value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the stringIndexType property: Method used to compute string offset and length.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Method used to compute string offset and length.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }

    /**
     * Get the content property: Concatenate string representation of all textual and visual elements in reading order.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Concatenate string representation of all textual and visual elements in reading order.
     *
     * @param content the content value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the pages property: Analyzed pages.
     *
     * @return the pages value.
     */
    public List<DocumentPage> getPages() {
        return this.pages;
    }

    /**
     * Set the pages property: Analyzed pages.
     *
     * @param pages the pages value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setPages(List<DocumentPage> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get the paragraphs property: Extracted paragraphs.
     *
     * @return the paragraphs value.
     */
    public List<DocumentParagraph> getParagraphs() {
        return this.paragraphs;
    }

    /**
     * Set the paragraphs property: Extracted paragraphs.
     *
     * @param paragraphs the paragraphs value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setParagraphs(List<DocumentParagraph> paragraphs) {
        this.paragraphs = paragraphs;
        return this;
    }

    /**
     * Get the tables property: Extracted tables.
     *
     * @return the tables value.
     */
    public List<DocumentTable> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: Extracted tables.
     *
     * @param tables the tables value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setTables(List<DocumentTable> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the keyValuePairs property: Extracted key-value pairs.
     *
     * @return the keyValuePairs value.
     */
    public List<DocumentKeyValuePair> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    /**
     * Set the keyValuePairs property: Extracted key-value pairs.
     *
     * @param keyValuePairs the keyValuePairs value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setKeyValuePairs(List<DocumentKeyValuePair> keyValuePairs) {
        this.keyValuePairs = keyValuePairs;
        return this;
    }

    /**
     * Get the styles property: Extracted font styles.
     *
     * @return the styles value.
     */
    public List<DocumentStyle> getStyles() {
        return this.styles;
    }

    /**
     * Set the styles property: Extracted font styles.
     *
     * @param styles the styles value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setStyles(List<DocumentStyle> styles) {
        this.styles = styles;
        return this;
    }

    /**
     * Get the languages property: Detected languages.
     *
     * @return the languages value.
     */
    public List<DocumentLanguage> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: Detected languages.
     *
     * @param languages the languages value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setLanguages(List<DocumentLanguage> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the documents property: Extracted documents.
     *
     * @return the documents value.
     */
    public List<Document> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Extracted documents.
     *
     * @param documents the documents value to set.
     * @return the AnalyzeResult object itself.
     */
    public AnalyzeResult setDocuments(List<Document> documents) {
        this.documents = documents;
        return this;
    }
}