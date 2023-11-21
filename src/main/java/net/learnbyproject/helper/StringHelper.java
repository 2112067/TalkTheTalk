
package net.learnbyproject.helper;

import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

public class StringHelper {
    public static String[] getDateParts(String date) {
        return date.split("-");
    }
    
    public static String convertBase64(byte[] avatar) {
        if (avatar == null || avatar.length == 0) {
            // return a default avatar
            return "iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAYAAAD0eNT6AABB4UlEQVR42u2dCZgcV3XvW94BA7YxiwMEEkzgERKW9xG29wAnLAkECCQmsSFACMS8QEh4QBJIAjiGQAAbGxtvwrJly1qsdbSNRprRaF9nNPuikWbrquqe7q7qnunumRGyNZVzS9vIGo16uqu7qrp+/+/7YWPLWm7VPefUvWeJRBBCvpZt2/Om4vHnTaRjr8pnjLfmTOMDE5Zxy3ja+Oq4ZXw/b2n35tPGkpxl1Iyn9Vr5Z1vzaW1XztIPjptG23ha68mZ2kAubejjppaU/z8mfz8p/2xKOKH+Xv0z9e/Uj1E/Vv036r/NpfUD6udSP6f6udWvIf9/8clfU/+e+j1MWPpfqd9TPqO/ZSJt/KZtGM/lqSGEEEKzOvfOKyZHozfmTP39ecv40ril/3Dc1J8Uh9tw0gErh2wcE0drBwknwEgbmvwZWk/+WfRF8tcf5E3jb3MZ/Y8mR0d+27abLucNQAghVK1f75eqL/dcRnuffCF/Xpzg7cLCvKntUA5SfYUHzbm7FiSo0wdTG86b+nZZk8ec04y0/jlZr/c4Jwm2fQlvEEIIId8rmzWuF0d/kzi3fxQeUcfn4uQnwurgSz9F0PKyfvvk6mG+/P9/kMDgvaOj0et40xBCCHmiqam+K+Ue/E35dOyvxTH9RBzUJvlrDKddsesFXdZ8o+Qp/Lf8/adzVvT31FUKbyZCCCHXpBLw1B29OpoWp/Ow0CHH1k/jiP12nWAcP5W0+KAKzE7mGNjzeIMRQggV6PA7r5Cs9nfmLf2bOUtbPW5pCRxsUNHjEritkOqGr4+b0T8g6RAhhNAZqTtlcRJ/KlnqP3IS8wKYcQ8FXx1MSMLhNlVpIWWMHx4dHb6WHYAQQqH5wm+6XGWZK4cvR8YtOMYwXxtIBYalNanyROmr8G65MriMHYIQQlUkOQJ+hdTYf1GO9Vc6DW9wfjATppGRhkrLpFzzb/LJoRvYOQghFLiv/M4rTpXjqQz9DpwbFBkQtKiTInViRP4AQgj5VM5dvql/QRL31kiJXg4HBu6ijakTJHm3PptO97+QHYcQQh5KGWJlkMVAb3DKwHBUUJmSw1+rmQiqB0EqlXo+OxEhhCogZXDF+N7qGGAxxDgk8HrmgToZkNLRv1QDm9ihCCHkopxJeJb+KWVoT06uw/GAL1sXj6skwvFM7JNT0ehz2LkIIVSE1BAdqdX+iDKoyrDiYCBIOHkoMtVRqk8+xFAjhBAqQGpyntRl/+fJfu84EqiKfgND0mzqP1Q5KjscIYTO+dpvunzcjP25GqoT5vG4UP3jj6W0cJ285x+j6RBCKNRSQ3bEGP6YfvsQQmKqJfFkJv5bWAKEUDi+9gcHr5K2q7fIMf9WnACAwxaV5MpIY4RQVSo3MvJScfp3yBGoicEHmKnzoJaUXIHvZbOxF2MxEEKBV9aMvUG6qP2KKXsAhfcWyKX1B48l9d/BgiCEgnXMb9vznF78prEegw5Q/LRC1dp6Im38H7WnsCwIIR87/qbLVZc+SeprxoADuHoqsF/yBG6megAh5CuZpvmCnKV/Q4xUFGMNUNZTgUH569fsROJqLA9CyDONjg5fK4l9P1CT0jDOABUdVZxRCYMq+MYSIYQq+sUvxue7YohGMcYAngYClrTL/ldOBBBCZZUayqOMjTI6GF8Af5UQSo7A/2cIEULIXccvRkUZF2VkMLYAPu8wmDa+OjXVdyWWCyFUvOMXIyKter9yyqhgXAGCUzUQHbdif6cqc7BkCKGCpYyGjDH9kmQcD2NMAQJdNTCQz+ifV+O1sWwIoVml5pdLVn83xhOgqpIF26U51x9i4RBC52kspb+Ozn0AVX4iYOmrJkdHfhuLhxCKZDKD10hm/11yVPg0BhIgDNcCxq/HTf1HqVTq+VhAhEIodScoLXtvk8z+FEYRIIzocckP+BuxBZdgEREKiU4N6mnDAAKAfAg0qYFDWEaEqljq7k/dAWL0AODZyFXgUgkEfhNLiVBVHfdLWV/a+I7c/R3D0AHALP0DJvKW/k2mDiJUBRpPxd6mSoAwbgAwh2uBZskPeDMWFKEA6lTffpXdfwKDBgBFNBF6RlULMF8AoQBJNfM5NTccQwYApeUGWMYRlTiMZUXIxxob0180bumPY7QAoAxlg/NHR4evxdIi5CNJws68Ccu4hWl9AFDu3gHjZuzPlc3B8iLkscTpv0I25gYMEwBUrqWwtjqfHLoBC4yQR5qw9Jslwz+NQQIADwYMmfLXj2OJEaqgVA/vcctYgBECAO97B+gP2obxXCwzQuU/8n973jSOYngAwEf05jPGW7HQCJVBanhPPq3/u1Obi7EBAP9NGTwuXQS/xXAhhFzUZCb+6ryp7cTIAID/uwgaDSo5GcuNUInKWcat42ltDMMCAAFKEEyrckEsOEJFKJ3uf6G04VyEMQGAAPOInUhcjUVHqOCv/vgbpf1mH8YDAIKP1jWW0l+HZUfoIpLa/k/l0loeowEAVRQEZMczxp9h4RGaQWr+tkzvuxNDAQDVmyCo/1BVNGHxETp95J+Lv0QyZxsxEAAQgtOAOjW4DMuPQi8pl3lHLm3oGAUACE/PAG2IxkEozEf+8+Q47MuqeQYGAQBC2DjoWD6jfx5vgEKlqWj0OfTyBwBQswSMB6am+q7EM6AQHPlHXz5uaU1sfACAM0HA3tzIyEvxEKhqlU9rb+K+HwBgxryAwawZewOeAlWf87eMD0kAkGOjAwBckNFcRrsJj4Gqyfl/iSl+AAAFJQcel4+lz+I5UKClxmJKP/8fsakBAOaGjD//nqqWwpOg4Dn/wcGrpLPfUjYyAECxnQONhbbdeQUeBQVG2axxvRxh7WIDAwCUHARsHR0dvhbPgnyvydHojUzyAwBwtX1w92Qm/mo8DPKtpK3v28dNw2SzAgC4fRKgJWgfjHypiXTsvZT5AQCU9SRgTEamvwuPg3yjvBX7Y2nwM8nmBAAod9dALS+9Av4Qz4O8P/bPGJ9goA8AQEV7BRzLW9pH8EDIM8lX/6dp8AMA4Enr4KflOuBmPBHy4Njf6e43xUYEAPAsCDghDYM+h0dClTz2/yc2HwCAX9D/Hs+EyirVllKizX9jswEA+Kx1sKV/Cy+Fyub86esPAODrroG3Mz8A4fwBAMIZBHwfr4XcS/jj2B8AgOsARMIfAACQGIiq+ctfSv3YRAAAAT0JoEQQFaNTTX6o8wcACHCfAJoFobke+3+CDn8AANXRMZC2wajAY38Z7ENvf6i6zGhdEqOi9rg5bI+nBoUh5++dfyb/jjWC6g4CjGMMEEKzSo30Zaof+BLluBOH7bzRYeejzXZuaL+dG9hl545us/OHt9i5nlo717nOznWstLOty4Vldq5lqZ1tWWxnDz1ZGPJjnf9G/tts23L5uVbZua61J3/uvno7f3S7nR/YLb/2ATuvHbLzsU57PHlEzWnn+YD/gwCZIsgoYTTzsb+pvT2f1nJsFPAoY9nOJ47aeb3Nzg/tE2e7zc711tnZzpqTDrlQJ+4VKmBQAUjvZglKdpwMEox2OWkY4NmCnxjNZ4y34vHQGU2ORm8cNw2TzQGV+ZqXI3j5ena+4o80nHSc6svb706+WNRpRPd6+bM22vnhg3Jy0H3yRIN3ATxBG5nMxF+N50ORbNa4Xsr9jrApoFxf9uMjfY7jU8foufZV1evo50rHGlmTRudKQ51+8K5ABYOA7kxm8Bo8YIhlDw5eJcf+u9gM4Cojclc/uEfuzjcF4/jeNycFco1wWK4QBvdJvsMR3iMod8vgrbbdeQWeMIzO37YvyaeNJWwEKL3taNS5u8/1bXXuwnHm7qCSEFUuhEp8JNEQyhQEPMbwoDAm/Vn6f7EBoJSsfOdYv3vj3DLtobhgQHIkVFKkui4Yt8gfAFe7BX4Xjxgi0eIXivta0ORLv/Vkdj5O3ztalshVwRZ5Fu30MACXggDts3jGcDj/D9HlD+ZkHOK9J4/3W5fifH1XfvjUyeoCeUa8q1BCo6Dj0ijoJjxkNTv/tPYmyf7M8sJDQZ3zpNlNrnMtTjYo1wRdUk6ptXAqAEX3CMiasTfgKavxzt+Mvly6/Om85DAr0iZXdbsjmS/IpwLL5RnuOdnymHca5jY3YCifSLwMj1lFmopGnyP3t0284DCr45eMc+72qylXYLFzPTCepBshzKVlsLF3aqrvSjxndZT7zZNSjwW82HBhx78dx08gAHA278c07sd7VkW5n3YbLzSc7/iH7Hz/DiejHCcZskCAqwEorDzwc3jQQN/7a+9gtC+cl9wn9ft06At3T4H84F6SBeFiVwGT+Yz+FjxpAJUbGXkpSX9wTkQf6zo5XQ8nCE6nwZVOB0f2BsySFDg4Nqa/CI8arHv/y+Tev5EXGE4f9+cO1+P0YOZAoLuWYUQw2+CgOvEpl+JZg3L0nzZ+xksLzle/fOFR0gcFtRoeOnByeiP7Bs6fGfADPGsANGHpf8kLC6pXvxq/i3ODuZ0GbOA0AC7Ex/Gwfr73t+K/m0treV7UkKPu+vnqh1KSBCVRlL0Ez7oKGDuW1H8HT+tDpdP9L5Q+/328pGFGd7K7s4eo6YfSycvAISYPwrNsTKedSFyNx/VdyZ++iJcz5Ef+akofjgvcpH21PZ44zP6C6UHAfDyun47+08aneSlDTKJPSrpW4aygbOOH89FD7DM4Syb2STyvDzSZib9a3c3wUob4vp8xvVCJ3ICBXew3OHXiaFhqwBwe2ON6fxnxu4sXMqQlfvJVRg9/qGgQIP0kpL04+w9UaWC9+KBL8MQeSXo1/zsvYkid/+AeHBJ4VCq43mkuxT6EnKV/A0/sSdKf9nZp0/gML2EIN50cxeKIwFM61sgxMEOFaBVsHJd5AW/GI1dQqVTq+TKu8SgvYAg3XD/OH3xUIZBixDBoPbZhPBfPXKmvf8tYwEsXRue/E6cDPhsotMrOJ/vZn2G/kjSN+/HMFZC0+r2ZFy6EG2yAO3/waRDQvpKTAFD9AT6Khy7vvf8rpPwizYsWtmz/JhwNBCAngK6B4S4N1FL5ROJleOrylPzNk0XewIsWwml+tPaFIJwEdK2z81aUfRtme5XWV+Cty3L0b9zCCxayzRTvdbqw4VwgMEFAzyapD2ekcLi7BBqfwGO7qGzWuF4dr/ByhYjUoGRZr8CpQPCGCB3dzv4NN7FMZvAaPLd7Wf8LeanC1GFLd+ay40wgsEGA5K2wl0NcsZTWH8Jzu9HtzzQ+yAsVsqP//h04EQj4AKHFcoXVzX4OMRPp2Hvx4KUk/sncZen2N8jLFKakv3acB1QHbcudqyz2dUhtmWX02YODV+HJi+71b9zFixSye/+2p3AcUEVJgbWqPpy9Hd7rzB/iyYuq+Y/+gXz9n+AlCk0TDbn334jTgOrLBxjax/4O7awA7WmZWPsmPPqcav6bLpeGP+28QCE6Lhs6gLOAKs4H6GWfh3di4EHpY3Mpnr3wo//v8OKEiOSAnWtZiqOAKu4UWEN/gHB3Cfw6nr0ATY6O/LaMWDzGSxOiCLl3Ew4Cqj8fYGA3+z20ZYHauMyxeSUe/iKS45JVvDBhyvpvxTlAaK4Cxkf62PehPQXQn8TDz+b8M9pNvChhypDVnElqOAcI07wAqgJC3BvA0t+Jp5952M+lkvjXxksSoq//QUb8Qhi7BB5i/4e3Q+AB8XWX4PHPa/er3cYLEq6afxL/IJS0Lmd0cKgnBmqfxeNPkxqcwLCfkEXCR7fhCCC8VwFHd2AHQjwsSHW5xfOfLfu7k5ciXGV/KiEKRwDhTQhcIqdgA9iC0OY/GT/A84vGUvrrVLckXooQff0facQBAKcAsg+wB2HtEGgcm8zEf4u7f9NYzwsRprt/vv4BznQITBzFJoQ2F8BYHu6jf8v4EC9CyCLf/p0YfoDTpwB9W7ELjAwOab//tNbNSxCme69hyYAm8x/gnOZA5AKEuDmQ0RLKOQHy9f8lXoCQff0P7cfgAzy7L8DR7diHUPcGiH0mVM5/aqrvylzaiPLww0W2fTUGH+DZ1wDSD0PGn2MjwpoLYBlH5BTgsvAk/qX1r/DgQ/aSx7ow9gAXCgJkHDZ2IsT20dS/EI6v/2j0OaoRAg89ZMdch+sx9AAXCgDaVzEjINRlgdqQbXdeEYKyP+3rPPAQJv9J4xMMPcCFGTc6sRWhtpP6l6v76z8ef570/E/wsEN2vCXDTzDwABcrCazHXoQ6GdDQ7cHBq6o58/9feNAhfLF7ajHwAIW0B2ZIUNj5WlU6f9M0XyA1jxYPOGx1rsN0/gMotCRwuBmbEWq0EdswnluFA3/07/JwQ/j1r7Vg2AEKvQaQ0zLsRtjLAvVvVZXzHx0dvlb+YKM83DBm/2/GsAPMpTMg1wBh7w5oplKp51dP5r+MPuTBhjKrVVr/LsOoA3ANAHMaFKT/W1U4/3S6/4Vyr5HloYbwJY73YNAB5noN0LsZ+8EpgFUVuQA5S/8GDzSkAcDAHgw6wJyvAZY5p2fYkLCj/33gJ/7R8z/Evf+7N2LMAYq5BpDW2dgQZgQEelJgzjJu5UGG9/5fDTnBmAMUcQ0wsBsbAvZ4xvhEQL/+7XnS9a+ZhxhSRg5jyAGKDQC6N2BDQHUH3B3Mr/+MdhMPMMztfw9iyAFKKQckDwCECUt/ZwCH/hjreXghjlyPNGLEAUrJA5AqGmwJSEngikA5/6wZewMPLuQBQNd6jDhAKdcAQwewJaBGBU9Njg6/Jjhf/2ntVzy4kFcA0AAIoMTpgA3YEjhdEXBfMHr+JxIvy5nGr3loISY1iAEHKJXOGmwJnE4GnBgb018UhLa/d/DA6ACIAQdwYTwwiYAQlPbA9uDgVWqQAQ8r5C8qEwAB3EkETPZjU+DsqGBprufbAGDCMm7hIUFuaD/GG8AFxukICOc0Bop90s/H/1t5SJDr34nxBnDjBCB6CJsC0+cD1PrS+U+ORm/k4YATAPRtxXgDuBEADO7FpsA5JYET6dirfFj6p/+YBwTOS9pbh/EGcKMUUE7TsClw7pwV43bfTf1TCQo8HHACgG6aAAG40wtgKzYFnl0SqPlqSqBKTODBwJkmQB2rMd4AbgQAcpqGTYHzGwNpH/HT8X8tDwXOBABtT2G8AdwIALrWYVPg/FMAS1vjj9I/SUhQiQk8FDgTAMgkM4w3gAsBQMcqbArMlAz4TD45dIMfSv9u54HA2QQVDcMN4BZymoZdgZk7Axrf8Tj5z75UJSTwMIA5AABlageMXYGZTwEGxAdf4t3gH0lE4EHAOVFpoh+jDeBmN0DmAcAFgwD9/d4FAGljGQ8BzmHkMEYbwM0AwBzGrsCFegI85onzn4rHn5dLa+M8BDjnBEB6l2O0AVwMAJID2Ba4EKNTU31XejD4R/8Uiw/nBwAdGG0ANwOARB+2BWabD/AxD+7/9ZUsPJwXAOjtGG0AN+cBxHuxLXBhTH1RRZ1/KpV6vmT/T7L4cH4A0IrRBnA1AOjBtsAs5YBabioafU7FAoCcZdzKwsOML6N2CKMN4OYVgOTVYFtgVjLGJyoZANSw6DBjADDcjNEGcPMEwOjAtsDFmgItrYjzT6f7X5gzjV+z6DBzAHAQow3gZgCgt2Fb4CITArVxVZlXgdp/7bMsOFwwABg6gNEGcDUAaMW2wEWRyrybKzD5z9jAYgMBAECFAgCtBdsCBVwD6CvK6vxHR4evlf7DT7PYcMGjKAIAAAIA8OAawJi0E4mry3f8b+pfYKGBAACggiOBCQCg4GsA45YyZv9ra1hkIAAAIAAAX1YDLCnT6N/OK1TDARYZCAAAKnkFcAjbAgV2BTQsGRF8qftf/xntJhYYCAAACADAz0GA9o5yZP//hMWFi/cBaMJoA5AECN6NCL7d/QDANNpZXLhoABAlAACgDwB4WA2w32Xnr72ChYXCAgBaAQPQCRA8CwBMbSqbjb3YxdG/xhdZWCjo5ZPjSow2ALMAwNNTgE+72P5XX8GiQkEnAIwDBnB3GqDRiW2BOSYC6k+4VP7XdPl4WhtjUaGwAKAdow3g5gkA44Bh7pUASSkHvKTkAGAiHXsPCwoFI18rGG0AFwOAeC92BeZOKvY2FxIA9R+xmFDwCUC8B6MN4OYVQOIwtgWKGQ70XTfK/1pYTCiYkT6MNoCbJwCJo9gVKCYRcE+J0/+i17GQMKeoU4wVRhvAxRMAcxDbAsWUA54oaTqgHCH8KQsJc7t3GsRoA7gZAFjD2BUoLgjI6H/E/T9UMPt0GKMN4GoAoGNXoNg8gO8VfwJgajtYRJgbOkYbwC1almBToAS0zUWP/5UkgkkWEOZKtnUZhhvADVqXY1OglAAgW9R4YDVSkMWDou6d2ldiuAHcoH01NgVKuwbI6G+ecwCQs/RvsHhQ1AlA5xoMN4AL5DrXYlOg1GvZrxQTAKxi4aCoE4Du9RhvADcCgO5abAqUmAhoLJnj/b89b9zSEiweFBUA9G7CeAO4EQD0bsamQKkNgaJzCgAmR6M3snBQ9AvXV4/xBnAjAOjbik2Bkpmw9FfOpQHQ51g0KDoAOLoD4w3gRgDQvxObAm4EAH9VeAVAWn+YRYOi75wG92K8AdyYAzC0D5sCpdtkS7t3LgFAB4sGRb9s0SaMN4AbAUC0GZsCpWNpTQU5/6mpvitliMDTLBoUHQDobRhvADcCAKMDmwJuJAJOSnL/ZQXc/2tvYsGgpAAg3o3xBnAjAIj3YlPAnf4sKeP1BQQAsb9msaCkAICRwADuBACJfmwKuJUI+KkC7v+Nn7BYUNp9ExMBAVwJAKwo9gRcssvGHYUkAG5isaDkO6eWpRhwgFJKAGUPYUvANZtsGTWFnADEWCwo+WXrYCAQQEkBQMcqbAm4Z5NNbXBW55/NGtezUODKy9bFPACA0uYAbMCWgKuYpvmCCw8Aymg3sUjgzjyAzRhxgFICgMNbsCXgdiLgu2Y7/v9HFglcqQQ4ug0jDlBKAmD/DmwJuJwIqH95tgDgERYJXAkApIUpRhyANsDgI7tsGvdf+AogrR9gkcCVF01rwYgDlBIAyB7CloC7AYC2c0bnL20CL5V2gRMsEtANEMAPXQB7sCXgMtqY+Pp55wUAE+nYq1gccI3kAEYcoATUHsKWgPudWhMvm6kC4H0sDriYbCJGbDGGHKAoFjt7CFsCZagEeOf5MwAy+udZHHB1+ETbCgw5QDHI3sGGQHkCAOOW8ysALON2Fgdc7QUgjUww5gBF9ADoWocNgfJcAaSN78wUACxkccDVAKCvHmMOUFQToHpsCJQJ/eHzrwBMbQcLA65GmgO7MeYAxQQAA7uwIVAutszQA8CIsjDgagAQPYQxByimBDDajA2B8thlyzjyrB4AnVfIpKApFgdcfdFi9AIAKCoAiHVhQ6A8V7OmcVz1/TkTAEyORm9kYcB1UvQCAKAHAPiwFPCVZ4//Tf39LAqUIdnEzrYswaADzIUWegBAmQOAtPF/zyYAWsaXWBQoSy+AzjUYdIC50LEa2wFlLgXUPjutBFD/IYsCZblv6t2MQQeYSwVAbx22A8ocAOjfPRsAmPqTLAqUJQDo34VRB5hLAHB0B7YDytyq3Xh0ehOgBhYFyhJpDjdj1AHmUgEwfBDbAeXOz9o47QTAaGNBoCwBAGOBAeZWAUAJIJT7ZDatH5jeBEhnUaA8pYBDGHWAuQQAKUoAody9APT+U02A7HnSGOAYiwJlqwRoewrDDlDI/X/LUmwGVABtzAkApuLx57EYUNZok6mAAIUFAJ1rsRlQEWy76fLIRDr2KhYDyhoAHNmKcQcoJADoa8BmQGXysxKJl0XyGeOtLAaUNQAY2o9xByikAmBoHzYDKmOXrfjvShtg4wMsBpR3KFAnxh2gkADA6MBmQIXaAcfeE5mwjFtYDGAoEIAPAoDkUewFVIZM7JMR+ZuvshhQ9kqA1mUYeICLVgAwBAgqdDIrM4BUF8DvsxhAJQCAxwFAFxUAUMl5AMa3ZRKgdi+LAWV/2Y5uw8gDzFoB0IitgErys4hEAUtYCCh7ABA9iJEHmC0AGDqArYBKDgR6LJKzjBoWA8o/E6AXIw8wWwIgMwCgslcAT0kSoF7LYkD5E06iGHmA2WYAmMPYCqhgHwCjRiUBbmUxoCIvXPsqDD3ATLStwEZAhdFrJQdA28VCQEUCgMNbMPQAM93/99ZhI6DSOQBbJQdAP8hiQEWuAaTNKcYeYIb7/4Hd2AiocA6AtisybhptLAZUBIOWwAAzBgB6O/YBKpwDoB+UJECth8WAiiBJThh7gBkSAKVdNjYCKmuPjTYZBqQNsBhQuUTAlRh8gHMSAJdjG8ALeiO5tKGzEFCxAKB3MwYfYHoCYE8ttgEqb4vl419yALQkiwEVSzwZ3IvRB5geAAzswjZA5QOAtGGoHIAxFgMqFgBItzOMPgAJgOB5DoCprgAmWQyobEfAxRh+gDMdAAexDeABWlYlAU6xEFBJsh01GH4AdfwvSbHYBPAmB8D4dYSFgIq/eH1bMf4ATgfAzdgE8CoAOK5OAJ5hMaCi1wCMBgY4ef8vSbHYBPAoCXAyoo4BWAyoKInDGH8AZwRwN/YAvGoFnFNJgBMsBlQW3c62LsMBQLhpWSwDWTTsAXjFqJoGmGMhoOLHT9L8BCcAob7/71qHLQAvywAtNQwow2JAxY+fZPoZTgBCffx/dDu2ALzD0hKqE2CKxYDKNwRiMiCEvQFQK7YAvCSmcgA0FgIqH30O0xAIQj4BkAZA4GUZoN4vOQDGYRYDPHkBu9biCCCc9/8dq7AB4HUydofKAWhlIcCTawC5A8UZQCgDAGmGhQ0Aj/sA7FdXAHtYDPAkANDbcAYQzvv/aDM2ADy+hjUaI/I/DSwGeEJqCGcA4QwAkkfZ/+D1FcBGdQWwjoUAr8h2rMEhQLhoW8HeBx90AtRXqCTAJSwGeJcHsA2HAOG6/z9cz94HP1wBLFQ5AA+wGOBZAKC14hQgZPf/Tex98N72WvrdcgWg/4jFAO/aUQ7jFCBk9//97HvwwxXA9yJ5y/gXFgPoBwBA/T+Ein+UKgDtNhYCPA0Aju7AOQD1/wCVPQH4XGTC0j/FYoCnL6LRgXOAcAQAWgt7HvzCxyN50/ggCwHeJqNEndnoOAio+v7/Jv3/wR9MpGPvjeQz+ltYDPC8H0DPRhwEVDedNex18I/NNWP/KzKeGv4NFgM8PwUY2oeDgOo+/u/fyV4H3zA6Gr0uYttNl7MY4Dkjh3ESUN3H/0YX+xz8kXhtak/btn1JREnaAVssCnh+JNW6HEcB1fn137JUOq/p7HPwRwCQNozIaY2ntW4WBTx/KfsacBZQnQFATy17HHzUgM04dDYAkLGALArQFhigTN3/hg6wx8FH6JvOBAD5tLaYBQFftAWmHBBo/wtQXizj0elXAP/NooAvrgG6N+AwoLqQkdfsbfBZAHD7tABA/wqLAr64Bhjci8MAyv8Aytp8zfji9ADgYywK+IJEH04Dquv4P0b5H/gsAJAOwGdzAOgGCH66BpCJaTgOqApal1H+B/7sAnha2axxPYsCvgkAmA4IVTP9r4E9Db7DTiSuPhMASEegebm0Ns7CgC+Op2LdOA+ojuN/KW1lT4PPegCkI8+W5AF0sDjgjwxV3c62PYUDgWAjJa1q0iV7Gnx1wmrpB88LAHKWtprFAf90BdyKA4FgH//3bmIvg/9OWNPGkhlOAIyfsjjgm5fU6MCJQLCP/6NN7GXwYw+AO84PACz9yywO+OoaoHUpjgQCe/w/nhpiH4MPTwD0z51/BWDq72dxwF/XAPU4Egjm8X/3RvYw+JIJy3j3eQHAZCb+ahYHfBWp6u04Ewjo8f9B9jD4064mEi87LwCQUsBLZUbwJAsE/roGWIZDAY7/AdxhVJX9R2aSmhHMAoG/rgEacCgQLDj+B7/a07SxJ3IhjZv6IhYJ/NUUiGoAIPsfwB30+RcMAKQ+8NssEPivKdByHAsE5/jfHGbfgk+7AGpfv/AJQNr4OIsEvjsFOLoNxwIBaf5Tx54F/9pSy/jQBQOAydHojSwS+O6ljffgXCAYx/86vf/B1ycAr7hgAHCqEmCChQLfJa8wIhgCMfpXY79C8CoAzjQEShv7WCjw3SnAwF4cDPh89G8jexX8a0NNfVvkYpIA4AEWC3z38ib7cTLg7+N/uapir4J/7//1n180ABi3Yn/HYoEfyfZsxNGAP7/+5YqKPQr+ngGgffbiAUAq9jYWC3z5AkcP4WzAn1//ckXFHgVf51FZ0d+7aABgDw5elTO1Z1gw8F9PAI3WwOBDVOvfAfYn+Nf5m8Yx2266PFKIpCVwO4sG/uwJsB2HAz6r/d/E3gSff/3rByOFSrULZNHAlyQO43TAZ7X/7exL8HsDoPsKDgDkB3+RRQPfRrNd63A84A/aVjjtqtmX4GubmY59puAAIGfF38iiAcmAABc5/h/YzZ4E36O6/BYcAKiOgONpLcvCgT+TARkQBD4Z/JMaZD+Cz9v/GuZFOwCe3w/AaGDxwLdHWgO7cEDg7d3/4S3sRQhCALA+MlfJV9YPWTzwLfLlpb7AcERA5z+A2RoA6f8x5wAgb8X+hMUDX58CHK7HEYE3d/9da9mDEAw7mdHeN+cAwDTNF0hDoBMsIPiWEUoCwaMAQGth/0EQGgD9eioafU6kGEnntSYWEZgPADDN+bevpPQPgnH8b2o7I8UqnzbuZBHB1y+40YFTgsoGAIP72HsQkIop4wdFBwDyE3ycRQTfnwJ01uCYoDLILIpxa5h9BwE5ATA+WHQAMDoavY5FBN+/5ForjgkqNPWPxj8QlPt/7Rk7kbg6UoqkhvAQiwn+RhoDdXAKABX4+jf5+oegtP81dkdKlXQE/G8WE/x/CtCCg4Iyt/3dxV6DIN3/f7/kACBn6u9nMSEQpwDkAkA5v/5TQ+wzCAwTlvHukgMAe3DwKjlKmGRBwf8VAe04KijT3f9e9hgECG3Mtpsuj7gh+ck2s6AQiHuv7g04LHD563+5zFOPsr8gOHbQ0tZE3FLe0r/FokIgTgHivTgscPfrf+gAewuCdiX6FdcCgJwVfyMLCoGJfvuYEQAu0bGGrn8QOCZHh1/jWgCgZglLTeEQCwuBQCYF5lqW4ryg9K//WCf7CYJ2/98dcVt5S7uXhYXAXAUM7cOBQWllf7117CUIIj8pQwBgfIiFheDUwOrOyFYcGRTl/OUEKZ/sZx9B8Mr/0rH3uB4AnCwH1PIsMAQGNS64ZTEODeYeAAztZ/9A8DCNjFzZXxYph6S0YDWLDIFKCJTubTg0mJPz71xL4h8E8+ozrS2OlEv5jP55Fhm4CoDqPvo/yr6BgHb/0/+ybAGAmg4o1QBPs9AQKBJH5CpgCQ4OLp71P9zEfoFgnnaaxrFUKvX8SDlFV0AI5NFYtAkHBxfJ+t/EXgG6/80aAFjabSw2BHKDHKZBEMzMaPOTjPqFgN//x/667AFAbmTkpXINcIIFh+DlAwzb2fbVODw4h7FDi+zorifYHxDk4//jmczgNZFKKG/q21h0CGo+wFgzTg/OMtzwgD2w/XH2BgQYfWOkUpJf7O9ZcAgqxq7HcXzgEN/5K7tzzc8IACDYx/8Z/W8qFgBks7EXyzXAMyw8BJHBbQttrfFBHGDIMfc9ZnfV3EkAAIHP/k+n+18YqaTUkQOLD0ENAJTRH5GvPxxhOMkcfNzuXf9z5z0gAIBgJ//pKyKVVi4d+wyLD0EOALrW3Gmn9j6KQwxb0l/zIrtv4z1nnD8BAASaTOyTFQ8AVMOBXNqY4AFAUAMARfe6u2xr/0IcY1iQBND+unvPcf4EABBctDE1pyfihfJpYykPAIIcACh61/3cTh8gMTAMDNXff57zJwCA4JY2GwsiXilvaR/mIUDQAwDF4fV3y73wEzjJKia69cEZnT8BAAQ2ATCjvc+zAECNHZTfRIwHAUEPABR9G+6xR5sIAqoRbdtDF3T+BAAQzOx/bUB88CURLyXVAD/mYUA1BABOELCRIKDaMLY/PKvzJwCAgGb/fzfitcZS+ut4GFAtAQBBQJU5/20Xd/4EABDAr/+piXTsVRE/SKoBdvNQoFoCACcnYKPkBDSRGBhk9Isc+xMAQIDZEvGL8pbxRR4IBCYAEGNfiFNQjWKoDqi+hD8CAAj8CYBl3OqbAMBOJK6WesQsDwaCQOzAyoIdQ8/anzstY3GqwS/1IwCAqsA0TM9q/y88IdD4JQ8HgoDZucVpAFSoc+hae6ed3L0A5xqADn/9dffN2fkTAEDA+GnEb8pZ8TfyYCAIWF31drThIWkFXLiDUG2DYzsextH6trf/E+e1950Lg9ufYG9AIDg2pr024kflTW0nDwiCEADEtv/K7t/0yzk7CnW8PNaMw/XbVD/VzbFY568wDq5mbwDJf6WdAhi38oAgKAGAIUyfCFcoR2p/QddAn6AmOnafGulbLL3SBTLV2cDeAP/jxeCfQjU11XfluKkleVAQhABAoTc+fGYm/FzokRyC5B4mCXp336+S/R4oyfE7Vzvy7NU7YHYRAIDvidl20+URP0uGE/wnDwqCEgAohot0JCovQGt80Jkwh1Ou4H2/lGaWct8/neEtDzjvAAEABKDz379F/K58cuiGnGkc54FBUAKAk/kA9xXtRJwrAfoFVIT4LjnyX3unK87/qDzz08+fAAB8XfefNiazWeP6SBA0bumP89AgSAGAkw+w4e6SjpJjO+bjpMtY4jdY/0tXHP/p6Y/Gtl8RAEBA0B+OBEXjo7H/zQODIAUAThCwbb58Xd5V2ldl3b12+iCnAW6S3LOg5Cz/6ahnrDfOP+fZEwCAvzv/xX83EiRREghBCwAUmuoPUFNiYpkcUce20zOgVNRApsEt7n31nz6p0bY+dN5zJwAA/6JtjgRN4xnjEzw4CFoAoBjaIn3ka0p3NipRzdxHpUBRd/1S3tez7i5Xnb+T9Ff/wIzPnAAAfJv8Z8X+JHABgG3bl8hvvpcHCEELABQDm1368pRAYnDL/UwWnENTH5VU6bbjV/TX/fKCz5sAAHza979NfOm8SBAl8wH+locIQQwAFEc33eve0fNaVTL4kJPMhqOfobRPAqQhOe7vKoPjd3Izau+d9VkTAIA/7/59NPWvmMZAUr5g8CAhiAFATLLE+za6+zWqjrUNyQ8gEDh9z7/IGd3bVXNnWRz/6auY2LZfEQBAsJy/qQ3K1/9lkSArb+nf5GFCIAMAJwiYb/dtuMd1p9R7OhA4tCi0jl81UXKrpn+2cr9CnjMBAPiw9O8rkaDLNM0XyD1GhocJgQwAHOY7jqQcDkqdCGjbHnIy3sNy1F/uL/4zzn/D3U5pJwEABO/uX0vahvHcSDVI2gPfzkOF4AYAqlHQfGdoTLmclXKIwzJp0Nq/sGqT+1QyZCUc/8kBPz8v2PkTAID/2v4a/xqpFo2ODl8rtYxjPFjwA2bnljkHAKeDgMNlDAKmtxZWU+6CniegrjdUOV+5svpnm+43F+evUEEhewN8kvlvplKp50eqSQwJAt8EAB2bigoATncLrEQQcLpj3ZCcCqT2BquXgPr9qtOMUrsqFt3id/v8OT9Xs6OOvQF++fr/dqTaNDoavU5OAbI8YPCaVMvaogOA05QjMXD2pMGf28MND/g2GFBH/NGtDzhH75V2+mecv8r2L8L5K1It69kb4Ievf6vqvv6nnQL8gIcMXpPYv6zkAEAND6r00fb0xEHVIlddE2QOPuHZcJ7ErkecL/3edXd55vTPlvr9wnkmxT7PxIHl7A3wwdd/AEb+lngKQC4AeIely730gpIDgLNjhH/pufNT2e7qdEAFBOkyjSVW2fvK4asM/r7ae6Rhz52e/7nPdPibNta3WOI7H1NlV+wP8PTrX1XNRapZEuF8l4cNXpE1elxz/qc5md3+M984RHX3rroYqqBAjShW1waFnhQoR69+vEreU86+X6Yb+uELf8bKCWFw8/2uPcdc/DB7BDzs+a9/K1LtUvcbqsaRBw5ekOnb5XoAoIg2lL+pjRulhuqOXl1dqADBQVrkqk55KsfAT0FMIX8WteZuPsP0kT3sEfCm6590zJ2KRp8TCYNkUuA/8dDBC5JNq8oSACj0xoflfv7uwDjRoNIjwYpaa7efX7J5NXsEPLqa1G6LhEX24OBVEvFEefBQ0Sh75EjZnP/0roFHNt6Loy5XjwSV7LdtftmeXy7Rz16BCh/9G0dsu+nySJiUN/Uv8PChoh0AO+srEABMywtYcydO28Ujf7Wm5X5uVncjewUqyoRl3BIJm9SUI8m67eQFgIpE2ckBSWx7tGIBgHMlsJUrAbeO/LUyHPnPyK7H5F0ZYs9ApY7+m8UXXhIJo/JW7I95CaAy3f/qKur8p08T7Jdku84aHPmckTVTiYqVfma0BYaKff2nY++NhFnSF6COFwHKyZje6Y3zf1aVQM/au3DqhZYySulhtOEhj57XI1Iu2sXegfLmJFna6kjYlbOiv5cztRO8EFCWo//UsD2yd7HnAcDZxkH3Barczova/n7nq3++p88psXeJNGYZZg9BeZy/qT19LKn/TgSpUwB9Pi8FlKPrX/LQWt84/9NokhvQu4HcgJk6Gka3PuSb53RyPgDdAaEsTX/uxvOfzgVIJF7GoCBw/d6/yLG/lWKo/gFPJub57rhfTT2sQIY/+QDgl5a/Y2P6i/D85yQE6t/k5QDXSv666n3t/Kf3Deivu8/urrkzlKV9A3W/LGtdvytBQA+lgeDqyeT/w+OfVxbYeYWcAvTwgkCpx/5me11AnP+06YJOtcB9oegdoBy/yu43GucH5vmYnZtVyRb7C0r9+m+Rsr9L8fgzJQSaxgd4SaD4Wv8hp51r0Jz/+YHAvY6TrE7Hf5+08Z0fyGeTPFQjSaX0CICSmv68G08/a1WAvooXBeZc6qd12iN7FgXa+Z/TREgCAXU8Xg05AurPoK45/H7UXwgje2Vqok6JIBTz9a8/gYe/iCYz8VfLnIBJXhgoLJs2aptdDVXj+M87ETiVLNi7/p7gZfWvv1uS+x4Qx19tz+URp2VwnisBKNROpbWcnFDegIcvJCEwbfwrLw1cjNGhFl/V+Je9fFDa4fbX3evrUwHna9855n+46p9HYt9ie2y4lb0IhfAPePaCEwKbLpf62w5eGpiJrNFtJ5pXhcbxX6iz4NFafwQD6vdwRH4v6vcU2xa+Z5FsXuO8k+xNmLnjn36QxL85asLS38XLA89u6asSscLs+GduLPSQky+gjtwr06P/Tqdpz4Dc62s+atzjfeOgtQQC8OyOfyfyGf0tePRiEgLT+kO8RKHvmGVnBpvs5MEVOJkC+wqoL3HlnPs23OPK/AH1hX944z1OkDFc/6DnbXp9fyLQtFKup5qdklT2cNjv/o278ORFanR0+FrpDTDCixTCyHmkz0m0iu9+AqfiQmmhtvVBJyFPZeOrq4O+jb+Qr/h7nC/5k9wj/+we59+pH6M686lhPNWQue9ZxYC8u6qJUDZ+hD0dRhuWNqJ2InE1nryUOQGm9he8TCHZMIkBO923204c4GsfqixhUE6w1LudSw6w10Nzeql9GA/uSlWAvoIXqkqdfuywnT68Q5z+chwFhOOKQAUDh3fauXgvNqBqO5IaC/HcbuUCjIy8VA1Q4MWqjm59o4PNTrveamrcA1BsYyGzY7OTM0CXwWpBGxkdjV6H53Y1IdD4NC9WELtfDUutdIttddbLV/5TGH2A2a4KZI+oxlZOfwHZO9iQAJIxPoHHdr03gD1PZgWs5QXz/b2XnY12OMlP6t4ztuMRDDtAMcjeUdcFTiKh7Km8SefBAGT9P4W3LlcugLRS5CrAf9P3skaXc4+vBvHEdyzAcAOUAbW3VNMhlT/g9BugzNBntlBL5HLxl+Cpy9sg6GZeNo8T9+KSuHdkjzQ+WWfHdz2GcQbwIiDYtdBOta63M0f2OmWz2Cav0T+Kh65IaaD+BC9bJcvz+u3R/gN2qq2WunwAvyYU7nnCTrVvlL160CmpxXZV1Pk/jGeukDKZwWskKVDjpStXpv7gyUz9jjpn4AnGFSCIFQZLbLPzVIVBkgqD8rX71ftp+FPpqoCM9oe8fG5m6reezNTfvwzjCVDlFQZ5Kgxc6/U/YRnvxiN7cRWQNn7KS1jEF755OlN/m2QZr5RsYxL3AMJVYbDAmVlg9W6zx7QOZ+YGtrGohj934Ik9Kw3svEKNWuRFLCRTv5tMfQC4QIXBo2crDHQqDAor+dN2SXn6ZXhiDzU5Gr1RHkSOF/LZmfq9Tu9xNaI0RqY+AMypwuAxp8pHVfuoqh9s6rOvTY3MRDr2KjywL7oExj7D9LwjdqZ/n222biBTHwDcDQjEpqTaNoqN2S+25igBgBn7czyvn/IBZPhCqBy+TBUbHTgoPfU3Of3EMVIAULkKg8XOPI+M2KB8yCYc5tL6g3hcv+UDSBmGDGHortr7ptSpITpS1jOybylGCAD8ExCITbK6tkjJ4aHqHmpkGm22YTwXj+tDZc3YG3Jpbbw6MvVPluapsh2G6ABAsEoOl58sOYyqksNotUz5Gzs2pr0WT+vnfADLuDWopXmqHIfSPACouqFGTauCX3KYiX0SDxsA5U3j/gAMjqA0DwAoOQxAQCBT/u7EswZEU1N9V/qvP4DU4semlebtpDQPACB2uuRQbGNObKT/kv6M3bbddDmeNUBSNZrjppby8sXJyoSuzNF9zsSu+O7H2egAAAWUHKpy5szRvXY2fsTrD7f4eGr4N/CoQcwHyGjvk17Nz1R8ap5M5BrZs4jNDABQ8pTDRWJTa09NOeyvYJ9/47iMn38nnjTI/QHSxlfLNzVvgKl5AACVrDBQUw7F5irbqyaXls2+W8YX8aBB7w9g2/OkSdACd2rxh506V6ur3h7ZTy0+AIDnAYFMMFU2eXSoxZbjepeqsoz78Z7VEgQMDl4liRz7SqrFP7hcXrZH2HAAAL7lEacHgdW9VXoQtBXVg0BKsneqQXN4zmoqDUwO3SBBQHT2Ix/G5AIAVG0PAum3Mvu9vzaQzcZejMesxiAgrb3pnMmByuHrXXa6l1p8AIDq70Gw4FQPgh1OHxblA6Z3+lPdZPGU1VwZEO/9lNmzcyp5qIZafACAMLPzMacvi9m788SY3vMxPGQIJDWma3j5AQBAkWrZsBjPGJ7KgEsSTau6ePEBAELeZ6C55hBeMXSVAY1XSWb/CBsAACCkzr9ptWbbjZfhEcOYD9C6+yWxfUtybAQAgJAlBO57ajTT0ngNnjDESvU2vj6++8njbAgAgJB8+e998liir+E1eEAUyXTU32TsfPwEGwMAoLpRtn6sr/EdeD509iSgq/4zxo4FU2wQAIAqdf5i4xOd9X+Bx0PnKd219Ws0AwIAqMaugI/aqc662/B06MInAe2b7lDtI9kwAADV4vwfkZkum7+Dh0MXVbJj0wNsGgCA6sBqr70Lz4YKPwlo27iMjQMAEGzMtk2P49HQnJVoW7+WDQQAEExS7bVP4clQ8dcBrevr2EgAAAH78m/ZUIMHQ6WfBLSub2RDAQAEg+Sh9ZvwXMgVqeFByZa1u9lYAAD+JtG6diteC7kfBDSv28UGAwDwr/NXthqPhcp0HbB2KxsNAIBjf0RiIAAAkPCHQnMSQIkgAAClfiicolkQAICHx/7ttQvxRMi764D2uvuZHQAAUEHE5tLeF/njJMAZIMQUQQCA8jv/Rxnsg/wlNUpYzZpmgwIAlAdlYxnpi/x5EtBV/xlj5+Mn2KgAAC47f7Gtic76v8DTIN8q01F/U3z3k8fZsAAA7jCy98ljY32N78DDIP+fBPQ2vj62b0mOjQsAUBrxfU+NJvoaXoNnQYFRtrfx+sTB5SNsYACAIr/8m1ZrmZbGa/AoKHCyBxuvSjSt6mIjAwDM0fk31xyy7cbL8CQouEGADKYwW2tXs6EBAAqr8U+1bFiM90BVI6ur7nbKBAEAZivze1TK/Db/Cx4DVZ1UCUts98Jn2OgAAM9y/nueeDrVs+2jeApUtUq37/h9KgQAAKZl+h9YNqaqp/AQqOpl9m18QappzWE2PgCEnUTzmo5EovFqPAMKVXKgM02QGQIAENJkP6b5oXBfCcgMgdjOhbQPBoBQtfW1Ohu+hAdAoZdqcTmyd1kewwAAVX/fv39pNtm37S1YfoSm5QUkD61tx0AAQNU292mpabKNtc/F4iM0UyDQvum+2E7yAgCgio78ty+YEtv2Eyw8QheRqoVV068wHAAQ+K/+vUsmze76D2DZESpQufb6lyYPrjqCAQGAwJb4NdV0qcFoWHSEirwSoIUwAASrpa8c+bdt+SkWHKESlemovymxbylVAgAQgCz/ZWNWx/Z3YbkRckmqU1aiuWY/BgYA/Ik09jm0bqcag47FRqgcVwKdW77OQCEA8BW7Fh23uuq/jIVGqMyyOja9Mtm8+iiGBwA8T/Q7tLon2b39BiwzQpU8DZAkGzU/GyMEAF608021b7oDS4yQR8p01r05fnBlHIMEABWr7W9aETX76t+ABUbIYzmTBTvqfsFpAACU9at/1+Mn6OiHkB+vBCQiTzSvGsZQAYDbqLyjRF/Da7C0CPk5EOjY8mODEcMA4AZSdZRs3/Q9LCtCAZGqFEg0r+nAgAFAsXX9anqfakuORUUogMp0bfmCGsaBMQOAgkv7pPOo1dNwKxYUoYBLzd822zaui+14FOMGALP28E+11C63OzuvwHIiVE25AV1b367KdzB0ADBDkl+/KivGUiJUzYGAtBOO73nyGEYPAEb2LZ6gjS9CIbsWSLZtWGVsZ9QwQDiP+x+V4/4NiznuRyispwGqd0DT2s7YjkcwigBhYMcCO9lU05Ls2vZaLCBCKJLq2fbRxIHlCQwkQPUS3788ZnY3fBCLhxA6PxBoq/9nygYBquyef8/i8XTX1q9h4RBCs0rdCZodtQ/F9jz+NMYTIMhd/J48nmzdeK9tN16GZUMIFSyzb+MLUu21T6kBIBhTgGC17zVbaxepZF8sGUKoaOVad78k2bJuM9MGAfyf2W+2bVg/2rnnOiwXQsg1xXvrfmukZd02AgEA/zl+FaSbh/e8HEuFECqbYl0Nr0q0rm9UbUMxvgAeO/7W9XXJ7u03YJkQQhWTM3GwbV0DJwIAFUbGfScPrd+E40cIeSo1LlQSjlarxCOMM0AZkcqcVNvGZdnexuuxPAgh38iZOijlgyN7FzFnAMDNOn7pzeGU8w02XoWlQQj5NxCQmuNU+6Y7Rg4sT2O8AYoncfApU4Z3/Ydt25dgWRBCgZLV23Bzqml1X3w7swYACu3Vnzi0uifT1fhnWBCEUPADgdbGNyZa126lqRDABTL6dz5+Itm6dkuqt/H1WAyEUNUpkWi82mqv+znXAwDTjvnbN/2Ern0IodAo2b75wyPNNYfoJwBhrN9PtKw7YHbXfwBLgBAKrVRJk6oeiO9flsE5QHV/7S+35Gv/vkxL4zXsfIQQmh4M9O1478ih9Ttie55gEiFUx9e+vMuqYdZYX+M72OEIIXQROaWEbfX/nGxefZQrAgic09++YEpVv5gdm/+JUbwIIVTCFYHVXntX/ODKeGwH5YTgT+JSvjfStFozO7b8mCN+hBByWWoiodm26XGVOU0wAN7X7D9iJw6sSKbaah9RszHYoQghVAEl+hpek2rb9KvEgeUJGg1BJb/01WmUBKIPqsmY7ESEEPJQ6utLZVePNK2IqvtXHBW4W7a3YCpxcPWQtLi+mwl8CCHkUzlDiTq3fH2kpaZpZPeiX+PAoLgBPE8eSzTX7Jd36R8YwoMQQgGU2d3wwWTbhpVyVztCRQHMlrmvjvbVuN1MR/1N7ByEEKoiqVbE6osueWjdzti+JbkYuQOhTuCL71+aHWlZty3VWXcbX/kIIRSm04HDe15utm35dwkI9ipnQGVBFSfvSbAX3/fUaLJ53S6zfcu3c+31L2UHIIQQcuT0HOjc/I1E6/pGVd6lerbjPAPcb18qRFQXPtWQZ7Rzz3W84QghhAqSbduXqBwCNasg0bS2M7Fn8Tglh/4szUvsW5pPHlrbnuzY9ECqa/MfqWfHG4wQQsg1OSONextuVj0Ikk1rWtWxMsmFlf2yj+9bmlGTJFVgJgHaJxmlixBCyLOTAjXsReUTJNrWr001rTmskgwJDEp09CpJr7mm12zdsMbs2vydVMeWt/FljxBCKBCBQaaz7s3pzvqvqHaxKgEt0bxqeESuEggOTt3Ty9F94sCqYVWZkWrfON/qqv9yun3H7+PoEUIIVa1UV7lUz7aPqpMDNeNAjUKON685mjiwzBzZt3jC2Pn4iUBWJsidfGz3wmfUnyGxf0UqeXDVkZGWtduT7bULVQa+1b31I2ThI4QQQrOeIjReluza9loVKKS7tn5Nktz+S+UfmK21q1UNe7KppkWNTR45uFJXlQvO/fjeZfmRfUsmY7sWHXeCiJ0LT6ivbaeqYeeCkw7a4RHnr+o04vS/Vz/e+W/kv1U/x8jepfn4/mUZ9XOrX0P9WurXVJUS0mBplfpqV78n9XtTjl3NaGAELkL+1/8AUoCFl8e8A70AAAAASUVORK5CYII=";
        }
        //return DatatypeConverter.printBase64Binary(avatar);
        // From JKD 8
       return Base64.getEncoder().encodeToString(avatar);
    }
}
