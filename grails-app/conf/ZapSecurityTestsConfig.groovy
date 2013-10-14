import org.zaproxy.clientapi.core.Alert

zap {
    installDir = '/opt/zaproxy'
    proxyHost = 'localhost'
    proxyPort = 8090
    proxyHostSystemProperty = 'ZAP_PROXY_HOST'
    proxyPortSystemProperty = 'ZAP_PROXY_PORT'
    reportsDir = 'zap'
    requiredAlerts = []
    ignoredAlerts = [
     	new Alert('X-Content-Type-Options header missing', null),
     	new Alert('X-Frame-Options header not set', null),
     	new Alert('Content-Type header missing', null)
    ]
    timeout = 10000
    debug = false
}