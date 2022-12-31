package animal.exception

class MonitoringAlreadyPresentException : RuntimeException {
    constructor()
    constructor(message: String): super(message)
}
