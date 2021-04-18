package com.producter.intern.exception;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.List;

public class ValidationException extends RuntimeException implements GraphQLError {


    public ValidationException(String message) {
        super(message);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}