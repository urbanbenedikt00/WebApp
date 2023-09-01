package edu.fra.uas.user.common;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

public class HttpRequestHelper {

    // Create a RestTemplate instance as a class constant to reuse it.
    private static final RestTemplate restTemplate = new RestTemplate();

    // Helper method to create HTTP headers with JSON content type.
    private static HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    /**
     * Helper method to create an HTTP request with headers and a request body.
     *
     * @param body the request body
     * @return the HTTP request
     */
    private static HttpEntity<?> createRequest(Object body) {
        HttpHeaders headers = createHeaders();
        return new HttpEntity<>(body, headers);
    }

    /**
     * Helper method to handle HTTP requests and catch exceptions.
     *
     * @param request      the request
     * @param responseType the response type
     * @param <T>          the response type
     * @return the response
     */
    private static <T> ResponseEntity<?> handleRequest(RequestEntity<?> request, ParameterizedTypeReference<T> responseType) {
        try {
            return restTemplate.exchange(request, responseType);
        } catch (ResourceAccessException e) {
            // If an exception occurs, return a custom response with an error message.
            return new ResponseEntity<>("not successful :: room service not available?", HttpStatus.OK);
        }
    }

    /**
     * Perform a GET request for a list of items and return the ResponseEntity.
     *
     * @param uri          the URI
     * @param responseType the response type
     * @param <T>          the response type
     * @return the ResponseEntity
     */
    public static <T> ResponseEntity<?> getRequestList(String uri, ParameterizedTypeReference<List<T>> responseType) {
        HttpEntity<?> request = createRequest(null);
        return handleRequest(new RequestEntity<>(request, HttpMethod.GET, URI.create(uri)), responseType);
    }

    /**
     * Perform a GET request for a single item and return the ResponseEntity.
     *
     * @param uri          the URI
     * @param responseType the response type
     * @param <T>          the response type
     * @return the ResponseEntity
     */
    public static <T> ResponseEntity<?> getRequest(String uri, ParameterizedTypeReference<T> responseType) {
        HttpEntity<?> request = createRequest(null);
        return handleRequest(new RequestEntity<>(request, HttpMethod.GET, URI.create(uri)), responseType);
    }

    /**
     * Perform a POST request and return the ResponseEntity.
     *
     * @param uri          the URI
     * @param obj          the ResponseEntity
     * @param responseType the response type
     * @param <T>          the response type
     * @return the ResponseEntity
     */
    public static <T> ResponseEntity<?> postRequest(String uri, Object obj, ParameterizedTypeReference<T> responseType) {
        HttpEntity<?> request = createRequest(obj);
        return handleRequest(new RequestEntity<>(request, HttpMethod.POST, URI.create(uri)), responseType);
    }

    /**
     * Perform a PUT request and return the ResponseEntity.
     *
     * @param uri          the URI
     * @param obj          the object to
     * @param responseType the response type
     * @param <T>          the response type
     * @return the ResponseEntity
     */
    public static <T> ResponseEntity<?> putRequest(String uri, T obj, ParameterizedTypeReference<T> responseType) {
        HttpEntity<?> request = createRequest(obj);
        return handleRequest(new RequestEntity<>(request, HttpMethod.PUT, URI.create(uri)), responseType);
    }

    /**
     * Perform a DELETE request and return the ResponseEntity.
     *
     * @param uri the request
     * @param responseType the response type
     * @param <T> the response type
     * @return the ResponseEntity
     */
    public static <T> ResponseEntity<?> deleteRequest(String uri, ParameterizedTypeReference<T> responseType) {
        HttpEntity<?> request = createRequest(null);
        return handleRequest(new RequestEntity<>(request, HttpMethod.DELETE, URI.create(uri)), responseType);
    }
}
