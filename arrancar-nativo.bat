@echo off
title Panel de Arranque Automático - GameStore DSY1103
echo =======================================================
echo   INICIANDO ARQUITECTURA DE MICROSERVICIOS (FASE 1)
echo =======================================================

echo [1/3] Levantando Servidor de Descubrimiento (Eureka)...
start "EUREKA SERVER" cmd /k "cd eureka-server && mvnw spring-boot:run"
timeout /t 15

echo =======================================================
echo   INICIANDO INFRAESTRUCTURA BASE (FASE 2)
echo =======================================================
echo [2/3] Levantando API Gateway...
start "API GATEWAY" cmd /k "cd api-gateway && mvnw spring-boot:run"
timeout /t 10

echo =======================================================
echo   INICIANDO SERVICIOS DE NEGOCIO (FASE 3)
echo =======================================================
echo [3/3] Levantando Microservicio de Usuarios y Roles...
start "MS-USUARIOS" cmd /k "cd usuarios && mvnw spring-boot:run"

echo [3/3] Levantando Microservicio de Envios...
start "MS-ENVIOS" cmd /k "cd ms-envios && mvnw spring-boot:run"

echo [3/3] Levantando Microservicio de Pagos...
start "MS-PAGOS" cmd /k "cd ms-pagos && mvnw spring-boot:run"

echo =======================================================
echo !SISTEMA INICIADO EXITOSAMENTE! Manten las ventanas abiertas.
echo =======================================================
pause