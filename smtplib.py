import smtplib

sender = "vickymayekar585@gmail.com"
receiver = 'victormayekar@protonmail.com'
password = input(str("Please enter your password: "))
message = "Mail sample for smtplib"

server = smtplib.SMTP('smtp.gmail.com', 587)
server.starttls()
server.login(sender, password)
server.sendmail(sender, receiver, message)
print("Mail is sent successfully.")
