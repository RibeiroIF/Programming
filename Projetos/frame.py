import customtkinter

from tkinter import *

customtkinter.set_appearance_mode("Dark")

root = customtkinter.CTk()
root.geometry = ("600x600")

frame = customtkinter.CTkFrame(master=root)
frame.pack(padx = 40, pady = 20, fill = "both", expand = True)

labeltitle = customtkinter.CTkLabel(master=frame, text="Sistema de Lavação", font=('Roboto',22))
labeltitle.pack(padx = 20, pady = 10)

labelname = customtkinter.CTkLabel(master=frame, text="Insira o seu nome abaixo:", font=('Roboto', 16))
labelname.pack(padx = 20, pady = 10)

inputname = customtkinter.CTkEntry(master=frame, placeholder_text="Nome aqui...")
inputname.pack(padx = 16, pady = 10)

labelcar = customtkinter.CTkLabel(master=frame, text="Qual seu tipo de carro?", font=('Roboto', 16))
labelcar.pack(padx = 20, pady = 10)

x = IntVar()

car1 = customtkinter.CTkRadioButton(master=frame, text="Pequeno", variable=x, value="1", font=('Roboto', 12))
car1.pack(padx = 16, pady = 10, side = BOTTOM)

car2 = customtkinter.CTkRadioButton(master=frame, text="Médio", variable=x, value="2", font=('Roboto', 12))
car2.pack(padx = 16, pady = 10)

root.mainloop()