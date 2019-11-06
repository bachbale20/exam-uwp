using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Contact.Util;

namespace Contact.Model
{
    class ContactModel
    {
        public bool Insert(Entity.Contact contact)
        {
            try
            {
                using (var stt = SQLiteUtil.GetIntances().Connection.Prepare("INSERT INTO Contacts (Name, PhoneNumber) VALUES (?, ?)"))
                {
                    stt.Bind(1, contact.Name);
                    stt.Bind(2, contact.PhoneNumber);
                    stt.Step();
                    return true;
                }
            }
            catch (Exception ex)
            {
            }
            return false;
        }


    }
}
