FROM node:slim

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

# Install node.js app
COPY package.json /usr/src/app/
RUN npm install
COPY . /usr/src/app

EXPOSE 8080
CMD [ "npm", "start" ]
