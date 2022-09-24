const {createLogger,format,transports} = require('winston')

const logger = winston.createLogger({
    format: format.printf((info) => {
        return '[${info.level}]'-'${info.message}'
    }),
  level: 'debug',
    transports:[
        new transports.Console({level:'debug'}),
        new transports.File({filename:'cypress/integration/PageObjectPatter/Logger/debug_app.log', level: 'debug'})

    ],
});
module.exports = logger;
