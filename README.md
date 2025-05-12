# ServiceDiscoveryJan25 – Eureka Service Discovery Server

This project is a **Spring Boot Eureka Server** for service discovery in a microservices architecture. It allows microservices to register themselves and discover other services dynamically, enabling robust, scalable, and resilient distributed systems.

## Features

- **Eureka Server:** Central registry for microservices.
- **Spring Boot:** Easy configuration and deployment.
- **Service Registration & Discovery:** Enables dynamic lookup and load balancing of services.

## Getting Started

### Prerequisites

- Java 17+ (or compatible with your Spring Boot version)
- Maven or Gradle

### Running the Server

1. **Clone the repository:**
   ```sh
   git clone <your-repo-url>
   cd ServiceDiscoveryJan25
   ```

2. **Build the project:**
   ```sh
   ./mvnw clean install
   ```

3. **Run the Eureka server:**
   ```sh
   ./mvnw spring-boot:run
   ```
   The server will start on port `8761` by default.

4. **Access the Eureka dashboard:**
   - Open your browser and go to: [http://localhost:8761](http://localhost:8761)

### Configuration

The main configuration is in `src/main/resources/application.properties`:

```properties
spring.application.name=ServiceDiscoveryJan25
server.port=8761
eureka.client.registerWithEureka=false
eureka.client.fetchRegistry=false
```

- `server.port`: Port on which the Eureka server runs.
- `eureka.client.registerWithEureka`: Should be `false` for a server.
- `eureka.client.fetchRegistry`: Should be `false` for a server.

### Registering Microservices

Other microservices (e.g., users, orders, etc.) should be configured as Eureka clients and point to this server in their `application.properties`:

```properties
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
```

### Health Checks

Eureka clients will periodically send heartbeats to this server. You can monitor registered services via the dashboard.

## Deployment

- **Production:** Deploy this server on a dedicated VM/container. Ensure high availability by running multiple Eureka servers in a cluster.
- **Security:** Protect the dashboard and endpoints using Spring Security or a reverse proxy.
- **Monitoring:** Integrate with monitoring tools for health and metrics.

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](LICENSE) (or your license of choice)