export class LoginError extends Error {
    constructor(message: string) {
    super(message);
    }
    }

export class PasswordError extends Error{
    constructor(message: string){
        super(message);
    }
}

export class CredentialsTakenError extends Error{
    constructor(message: string){
        super(message);
    }
}